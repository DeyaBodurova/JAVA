package shoppingSpree;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Double> people = new LinkedHashMap<>();
        Map<String, Double> products = new LinkedHashMap<>();

        String[] peopleData = sc.nextLine().split(";");
        for (int i = 0; i < peopleData.length; i++) {
            String[] currentPerson = peopleData[i].split("=");
            String currentPersonName = currentPerson[0];
            double currentPersonMoney = Double.parseDouble(currentPerson[1]);
            people.put(currentPersonName,currentPersonMoney);
        }
        System.out.println();
    }
}
