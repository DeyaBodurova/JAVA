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
                        if (!teams.containsKey(teamName)) {
                            System.out.println(String.format("Team %s does not exist.", teamName));
                        } else {
                            Player player = new Player(data[2], Integer.parseInt(data[3]), Integer.parseInt(data[4]),
                                    Integer.parseInt(data[5]), Integer.parseInt(data[6]), Integer.parseInt(data[7]));
                            teams.get(teamName).addPlayer(player);
                        }
                        break;
                    case "Remove":
                        if (!teams.containsKey(teamName)) {
                            System.out.println(String.format("Team %s does not exist.", teamName));
                        } else {
                            teams.get(teamName).removePlayer(data[2]);
                        }
                        break;
                    case "Rating":
                        if (!teams.containsKey(teamName)) {
                            System.out.println(String.format("Team %s does not exist.", teamName));
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
