package Basic;

import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        boolean isBigger = false;
        int x = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (x > n) {
                    isBigger = true;
                    break;
                }
                System.out.print(x + " ");
                x++;
            }
            if (isBigger) {
                break;
            }
            System.out.println();
        }
    }
}
