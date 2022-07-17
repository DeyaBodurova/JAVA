package footballTeamGenerator;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        Map<String,Team> teams = new LinkedHashMap<>();
        while (!input.equalsIgnoreCase("END")) {
            String[] data = input.split(";");
            String command = data[0].toLowerCase();
            switch (data[0]) {
                case "team":
                    Team team = new Team(data[1]);
                    break;
                case "add":
                    String currentTeamName = data[1];
                    if(team.getName().equalsIgnoreCase(currentTeamName)) {
                        Team team = new Team()
                    } else {
                        throw new IllegalArgumentException(String.format("Team %s does not exist.", currentTeamName));
                    }
                    break;
            }

            input = sc.nextLine();
        }

    }
}
