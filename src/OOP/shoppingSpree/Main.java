package OOP.shoppingSpree;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String,Person>people = new LinkedHashMap<>();
        Map<String,Person>products = new LinkedHashMap<>();
        String [] peopleInput = sc.nextLine().split(";");
        for (String personData:peopleInput) {
            String[] personParts = personData.split("=");
            String name = personParts[0];
            double money = Double.parseDouble(personParts[1]);
        }
    }
}
