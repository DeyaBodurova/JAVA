package OOP.JediGalaxy;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] coordinates = Arrays.stream(sc.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        int row = coordinates[0];
        int col = coordinates[1];
        int[][] galaxy = new int[row][col];
        fillTheGalaxy(galaxy);
        String input = sc.nextLine();

//        while (!input.equals("Let the Force be with you")) {
            int[] jediCoordinates = Arrays.stream(input.split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            int jediRow = jediCoordinates[0] - 1;
            int jediCol = jediCoordinates[1] - 1;
            int[] evilCoordinates = Arrays.stream(sc.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            int evilRow = evilCoordinates[0] - 1;
            int evilCol = evilCoordinates[1] - 1;
            moveEvil(galaxy, evilRow, evilCol);
        input = sc.nextLine();
        if (input.equals("Let the Force be with you")) {
                System.out.println(moveJedi(galaxy, jediRow, jediCol));
            }
//        }
    }
}
