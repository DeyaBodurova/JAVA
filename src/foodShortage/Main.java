package foodShortage;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int peopleCount = Integer.parseInt(sc.nextLine());
        Map<String, Buyer> buyers = new LinkedHashMap<>();
        while (peopleCount > 0) {
            peopleCount--;
            String[] data = sc.nextLine().split("\\s+");
            String name = data[0];
            Buyer buyer;
            if (data.length == 4) {
                buyer = new Citizen(name);
            } else {
                buyer = new Rebel(name);
            }
            buyers.put(name, buyer);
        }
        String input = sc.nextLine();
        while (!input.equals("End")) {
            if (!buyer.containsKey(input)) {
                return;
            } else {
                buyer = buyer.get(input);
            }
            input = sc.nextLine();
        }


    }
}
