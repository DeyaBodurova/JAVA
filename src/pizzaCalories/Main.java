package pizzaCalories;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] pizzaData = sc.nextLine().split("\\s+");
        Pizza pizza = new Pizza(pizzaData[1], Integer.parseInt(pizzaData[2]));
        String[] doughData =
        Dough dough =  new Dough();
    }
}
