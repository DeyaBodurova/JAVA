package footballTeamGenerator;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        Map<String, Team> teams = new LinkedHashMap<>();

        while (!input.equals("END")) {
            try {
                String[] data = input.split(";");
                String commandName = data[0].toLowerCase();
                String teamName = data[1];

                switch (commandName) {
                    case "Team":
                        Team team = new Team(teamName);
                        teams.put(teamName, team);
                        break;
                    case "Add":
                        String playerName = data[2];
                        int endurance = Integer.parseInt(data[3]);
                        int sprint = Integer.parseInt(data[4]);
                        int dribble = Integer.parseInt(data[5]);
                        int passing = Integer.parseInt(data[6]);
                        int shooting = Integer.parseInt(data[7]);

                        if (!teams.containsKey(teamName)) {
                            System.out.printf("Team %s does not exist.\n", teamName);
                        } else {
                            Player player = new Player(playerName, endurance, sprint, dribble, passing, shooting);
                            teams.get(teamName).addPlayer(player);
                        }
                        break;
                    case "Remove":
                        if (!teams.containsKey(teamName)) {
                            System.out.printf("Team %s does not exist.\n", teamName);
                        } else {
                            teams.get(teamName).removePlayer(data[2]);
                        }
                        break;
                    case "Rating":
                        if (!teams.containsKey(teamName)) {
                            System.out.printf("Team %s does not exist.\n", teamName);
                        } else {
                            System.out.printf("%s - %d\n", teamName, Math.round(teams.get(teamName).getRating()));
                        }
                        break;
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
            input = sc.nextLine();
        }
    }
}
