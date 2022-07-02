package OOP.Jedi2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] coordinates = readPosition(sc.nextLine());
        int row = coordinates[0];
        int col = coordinates[1];
        BattleField battleField = new BattleField(row, col);
        Galaxy galaxy = new Galaxy(battleField);

        String command = sc.nextLine();
        while (!command.equals("Let the Force be with you")) {
            int[] jediPosition = readPosition(command);
            int[] evilPosition = readPosition(sc.nextLine());

            int evilRow = evilPosition[0];
            int evilCol = evilPosition[1];

            galaxy.moveEvil(evilRow, evilCol);

            int jediRow = jediPosition[0];
            int jediCol = jediPosition[1];

            long jediSum = galaxy.moveJedi(jediRow, jediCol);

            command = sc.nextLine();
            System.out.println(jediSum);
        }
    }

    private static int[] readPosition(String command) {
        return Arrays.stream(command.split("\\s+")).mapToInt(Integer::parseInt).toArray();
    }
}
