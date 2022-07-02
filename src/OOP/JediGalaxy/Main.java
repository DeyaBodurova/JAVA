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

    private static int moveJedi(int[][] galaxy, int jediRow, int jediCol) {
        int jediSum = 0;

        if (!isInBounds(galaxy, jediRow, jediCol)) {
            while (!isInBounds(galaxy,jediRow,jediCol)) {
                if (jediRow >= galaxy.length) {
                    jediRow--;
                } else if (jediCol < 0) {
                    jediCol++;
                }
            }
        }
        if (isInBounds(galaxy, jediRow, jediCol)) {
            int rowToPass = jediRow;
            int colToPass = jediCol;
            for (int row = jediRow; row >= 0; row--) {
                for (int col = jediCol; col < galaxy.length; col++) {
                    if(rowToPass == row && colToPass==col) {
                        jediSum = jediSum + galaxy[row][col];
                            rowToPass--;
                            colToPass++;
                    }
                }
            }
        }
        return jediSum;
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
            int rowToBecomeZero = evilRow;
            int colToBecomeZero = evilCol;
            for (int row = evilRow; row >= 0; row--) {
                for (int col = evilCol; col >= 0; col--) {
                    if(rowToBecomeZero == row && colToBecomeZero==col) {
                        galaxy[row][col] = 0;
                        rowToBecomeZero--;
                        colToBecomeZero--;
                    }
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
