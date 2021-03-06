package Basic;

import java.util.Scanner;

public class SumPrimeNonPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int sumPrime = 0;
        int sumNonPrime = 0;
        while (!input.equalsIgnoreCase("stop")) {
            int num = Integer.parseInt(input);
            if (num < 0) {
                System.out.println("Number is negative.");
            } else {
                if ((num % 2 == 0 && num!=2) || (num % 3 == 0 && num!=3) || (num % 5 == 0 && num!=5)) {
                    sumNonPrime += num;
                } else {
                    sumPrime += num;
                }
            }
            input = sc.nextLine();
        }
        System.out.printf("Sum of all prime numbers is: %d\n", sumPrime);
        System.out.printf("Sum of all non prime numbers is: %d\n", sumNonPrime);
    }
}
