package telephony;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] numbers = sc.nextLine().split("\\s+");
        String[] sites = sc.nextLine().split("\\s+");

        for (String number : numbers) {
            System.out.println("Calling... " + number);
        }
        for (int i = 0; i < sites.length; i++) {
            System.out.println("Browsing: " + site + "!");
        }
    }
}
