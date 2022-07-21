package foodShortage;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int peopleCount = Integer.parseInt(sc.nextLine());
        Map<String,Buyer> buyer = new LinkedHashMap<>();
        while (peopleCount > 0) {
            peopleCount--;
            String[] data = sc.nextLine().split("\\s+");
            String name = data[0];
            if (data.length == 4) {
                Citizen citizen = new Citizen(name,Integer.parseInt(data[1]),data[2],data[3]);
                buyer.put()
            } else {
                Rebel rabel = new Rebel(name,Integer.parseInt(data[1]),data[2]);

            }
        }

    }
}
