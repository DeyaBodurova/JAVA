package Basic;

import java.util.Scanner;

public class DeposuteCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double deposit = Double.parseDouble(sc.nextLine());
        int monthsDeadline = Integer.parseInt(sc.nextLine());
        double rate = Double.parseDouble(sc.nextLine());
        double sum = deposit  + monthsDeadline * ((deposit * (rate * 0.01)) / 12);
        System.out.printf("%.2f", sum);
    }
}
