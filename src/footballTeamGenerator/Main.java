package footballTeamGenerator;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        Map<String, Team> teams = new LinkedHashMap<>();
        while (!input.equalsIgnoreCase("END")) {
            String[] data = input.split(";");
            String commandName = data[0].toLowerCase();
            String teamName = data[1];
            switch (commandName) {
                case "team":
                    Team team = new Team(teamName);
                    break;
                case "add":
                    if (!teams.containsKey(teamName)) {
                        throw new IllegalArgumentException(String.format("Team %s does not exist.", teamName));
                    } else {
                        Player player = new Player(data[2], Integer.parseInt(data[3]), Integer.parseInt(data[4]),
                                Integer.parseInt(data[5]), Integer.parseInt(data[6]), Integer.parseInt(data[7]));
                        teams.get(teamName).addPlayer(player);
                    }
                    break;
            }

            input = sc.nextLine();
        }

    }
}
