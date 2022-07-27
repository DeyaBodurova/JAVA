package Basic;

import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int packagesDogsFood = Integer.parseInt(sc.nextLine());
        int packagesCatsFood = Integer.parseInt(sc.nextLine());
        System.out.printf("%.2f lv.", packagesDogsFood * 2.5 + packagesCatsFood * 4);
    }
}
