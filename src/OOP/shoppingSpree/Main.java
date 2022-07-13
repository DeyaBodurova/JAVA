package OOP.shoppingSpree;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> line1 = Arrays.stream(sc.nextLine().split(";")).toList();
        for (String data : line1) {
            Person person = new Person(data.split("="));
        }
        Person person = new Person(data.get(0), Double.parseDouble(data.get(1)));
    }
}
