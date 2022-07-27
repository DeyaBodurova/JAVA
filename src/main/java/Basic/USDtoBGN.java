package Basic;

import java.util.Scanner;

public class USDtoBGN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double usd = Double.parseDouble(sc.nextLine());
        System.out.print(usd * 1.79549);
    }
}
