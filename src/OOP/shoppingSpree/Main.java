package OOP.shoppingSpree;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> data = Arrays.stream(sc.nextLine().split("=")).toList();
    }
}
