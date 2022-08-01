package Basic;

import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        boolean isSpecial = true;
        for (int i = 1111; i <= 9999; i++) {
            int cur = i % 10;
            int left = 0;
            while (cur > 0) {
                if (n % cur == 0) {
                    cur = cur % 10;
                    left = cur /10;
                } else {
                    isSpecial = false;
                    break;
                }

            }
        }

    }
}
//    Да се напише програма, която чете едно цяло число N, въведено от потребителя, и генерира всички възможни
//    "специални" числа от 1111 до 9999. За да бъде "специално" едно число, то трябва да отговаря на следното условие:
//
//        · N да се дели на всяка една от неговите цифри без остатък.
//
//        Пример: при N = 16, 2418 е специално число:
//
//        · 16 / 2 = 8 без остатък
//
//        · 16 / 4 = 4 без остатък
//
//        · 16 / 1 = 16 без остатък
//
//        · 16 / 8 = 2 без остатък
//
//        Входът се чете от конзолата и се състои от едно цяло число в интервала [1…600000]
//
//        На конзолата трябва да се отпечатат всички "специални" числа, разделени с интервал