package Basic;

import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int annualPayment = Integer.parseInt(sc.nextLine());
        double sneakers = annualPayment - (annualPayment * 0.4);
        double anzung = sneakers - (sneakers * 0.2);
        double ball = anzung / 4;
        double accessories = ball / 5;
        double expences = sneakers + anzung + ball + accessories + annualPayment;
        System.out.println(expences);
    }
}
