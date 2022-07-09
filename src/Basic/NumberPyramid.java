package Basic;

import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int x = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (i + j > n) {
                    break;
                } else if (i == 0) {
                    System.out.print(1);
                }
                System.out.print(i + j + " ");
            }
            System.out.println();
        }
    }
}
