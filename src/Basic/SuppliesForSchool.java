package Basic;

import java.util.Scanner;

public class SuppliesForSchool {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pens = Integer.parseInt(sc.nextLine());
        int markers = Integer.parseInt(sc.nextLine());
        int litersCleaner = Integer.parseInt(sc.nextLine());
        int discount = Integer.parseInt(sc.nextLine());
        double sum = (pens * 5.8) + (markers * 7.2) + (litersCleaner * 1.2);
        double sumAfterDiscount = sum - (sum * (discount * 0.01));
        System.out.println(sumAfterDiscount);
    }
}
