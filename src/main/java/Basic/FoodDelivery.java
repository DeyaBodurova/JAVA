package Basic;

import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chickenMenu = Integer.parseInt(sc.nextLine());
        int fishMenu = Integer.parseInt(sc.nextLine());
        int vegetarianMenu = Integer.parseInt(sc.nextLine());
        double sum = (chickenMenu * 10.35) + (fishMenu * 12.4) + (vegetarianMenu * 8.15);
        double desert = sum * 0.2;
        double finalPrice = sum + desert + 2.5;
        System.out.println(finalPrice);
    }
}
