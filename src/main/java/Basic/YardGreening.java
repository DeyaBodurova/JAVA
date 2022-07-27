package Basic;

import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sqrMTobeGreened = Double.parseDouble(sc.nextLine());
        double sum = sqrMTobeGreened * 7.61;
        double discount = sum - (sum * 0.18);
        System.out.printf("The discount is: %.2f lv.", discount);
        System.out.printf("The final price is: %.2f lv.\n", sum - discount);
    }
}
