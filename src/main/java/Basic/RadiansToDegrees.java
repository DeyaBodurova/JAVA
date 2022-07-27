package Basic;

import java.util.Scanner;

public class RadiansToDegrees {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radians = Double.parseDouble(sc.nextLine());
        System.out.println(radians * (180 / Math.PI));
    }
}
