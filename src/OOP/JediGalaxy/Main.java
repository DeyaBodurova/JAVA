package OOP.JediGalaxy;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] coordinates = Arrays.stream(sc.nextLine().split("\\s+"))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        int[][] galaxy = new int[][]

    }
}
