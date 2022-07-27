package Basic;

import java.util.Scanner;

public class InchesToCentimeters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double inch = Double.parseDouble(sc.nextLine());
        System.out.println(inch * 2.54);
    }
}
