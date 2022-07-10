package Basic;

import java.util.Scanner;

public class EqualSumsEvenOddPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] smaller = (sc.nextLine()).split("");
        int bigger = Integer.parseInt(sc.nextLine());

        for (int n = Integer.parseInt(String.valueOf(smaller)); n <= bigger ; n++) {
            int current = Integer.parseInt(String.valueOf(smaller));
            int sumNumFirst = 0;
            int sumNumSecond = 0;
            for (int i = 0; i < smaller.length; i++) {
                if(i % 2 == 0) {
                    sumNumFirst += i;
                } else {
                    sumNumSecond += i;
                }
            }
            if(sumNumFirst == sumNumSecond) {
                System.out.print(current + " ");
            }
            current++;
        }

    }
}
