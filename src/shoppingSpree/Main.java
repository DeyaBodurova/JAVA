package shoppingSpree;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Person> people = new LinkedHashMap<>();
        Map<String, Product> products = new LinkedHashMap<>();

        String[] peopleData = sc.nextLine().split(";");
        for (int i = 0; i < peopleData.length; i++) {
            String[] currentPerson = peopleData[i].split("=");
            String currentPersonName = currentPerson[0];
            double currentPersonMoney = Double.parseDouble(currentPerson[1]);
            Person person = new Person(currentPersonName,currentPersonMoney)
            people.put(currentPersonName, person);
        }

        String[] productsData = sc.nextLine().split(";");
        for (int i = 0; i < productsData.length; i++) {
            String[] currentProduct = productsData[i].split("=");
            String currentProductName = currentProduct[0];
            double currentProductCost = Double.parseDouble(currentProduct[1]);
            Product product = new Product(currentProductName,currentProductCost);
            products.put(currentProductName,product);
        }

        String input = sc.nextLine();
        while(!input.equalsIgnoreCase("END")) {
            String[] purchaseData = input.split(" ");
            Person buyer = people.get(purchaseData[0]);
            Product productToBuy = products.get(productsData[1]);
            input = sc.nextLine();
        }
    }
}
