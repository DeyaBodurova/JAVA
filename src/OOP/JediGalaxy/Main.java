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
        int[] jediCoordinates = Arrays.stream(sc.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        int jediRow = jediCoordinates[0];
        int jediCol = jediCoordinates[1];
        int[] evilCoordinates = Arrays.stream(sc.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        int evilRow = evilCoordinates[0];
        int evilCol = evilCoordinates[1];
        String input = sc.nextLine();
        moveEvil(galaxy, evilRow, evilCol);
//        while (!input.equals("Let the Force be with you")) {
//            input = sc.nextLine();
//        }
    }

    private static void moveEvil(int[][] galaxy, int evilRow, int evilCol) {
        if (!isInBounds(galaxy, evilRow, evilCol)) {
            while (!isInBounds(galaxy,evilRow,evilCol)) {
                if (evilRow >= galaxy.length) {
                    evilRow--;
                } else if (evilCol >= galaxy.length) {
                    evilCol--;
                }
            }
        }
        if (isInBounds(galaxy, evilRow, evilCol)) {
            for (int row = evilRow; row >= 0; row--) {
                for (int col = evilCol; col >= 0; col--) {
                    galaxy[row][col] = 0;
                }
            }
        }
    }

    private static boolean isInBounds(int[][] matrix, int r, int c) {
        return (r >= 0 && r < matrix.length) && (c >= 0 && c < matrix[r].length);
    }

    private static void fillTheGalaxy(int[][] matrix) {
        int n = 0;
        for (int col = 0; col < matrix.length; col++) {
            for (int row = 0; row < matrix.length; row++) {
                matrix[col][row] = n;
                n++;
            }
        }
    }
}
