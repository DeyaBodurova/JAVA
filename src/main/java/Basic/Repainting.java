package Basic;

import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nylon = Integer.parseInt(sc.nextLine());
        int paintLiters = Integer.parseInt(sc.nextLine());
        int thinnerLiters = Integer.parseInt(sc.nextLine());
        int workingHours = Integer.parseInt(sc.nextLine());
        double sumSupplies = ((nylon + 2) * 1.5) + ((paintLiters + (paintLiters * 0.1)) * 14.5) + (thinnerLiters * 5.0) + 0.4;
        double workersPricePerHour = sumSupplies * 0.3;
        double finalPrice = sumSupplies + (workersPricePerHour * workingHours);
        System.out.printf("%.2f", finalPrice);
    }
}
