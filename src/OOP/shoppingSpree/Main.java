package OOP.shoppingSpree;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> data = Arrays.stream(sc.nextLine().split("=")).toList();
        Person person = new Person(data.get(0), Double.parseDouble(data.get(1)));
        List<String> data2 = Arrays.stream(sc.nextLine().split("=")).toList();
        Person person2 = new Person(data2.get(0), Double.parseDouble(data2.get(1)));

    }
}
