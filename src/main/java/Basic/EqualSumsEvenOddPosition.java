package Basic;

import java.util.Arrays;
import java.util.Scanner;

public class EqualSumsEvenOddPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int smaller = Integer.parseInt(sc.nextLine());
        int bigger = Integer.parseInt(sc.nextLine());

        int current = smaller;
        for (int n = current; n <= bigger ; n++) {
            int sumNumFirst = 0;
            int sumNumSecond = 0;
            int x = 0;
            int left = current;
            int count= 0;
            while ( left > 0) {
                count++;
                x = left % 10;
                left = left /10;
                if(count % 2 == 0) {
                    sumNumFirst += x;
                } else {
                    sumNumSecond += x;
                }

            }
            if(sumNumFirst == sumNumSecond) {
                System.out.print(current + " ");
            }
            current++;
        }

    }
}
