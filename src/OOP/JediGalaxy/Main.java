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
