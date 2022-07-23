package telephony;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> numbers = Arrays.stream(sc.nextLine().split("\\s+")).toList();
        List<String> sites = Arrays.stream(sc.nextLine().split("\\s+")).toList();
        Smartphone smartphone = new Smartphone(numbers,sites);
        System.out.println(smartphone.call());
        for (int i = 0; i < sites.length; i++) {
            if (sites[i].contains()) {
            }
            System.out.println("Browsing: " +  + "!");
        }
    }
}
