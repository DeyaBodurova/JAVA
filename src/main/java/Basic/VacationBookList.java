package Basic;

import java.util.Scanner;

public class VacationBookList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pages = Integer.parseInt(sc.nextLine());
        int pagesPerHour = Integer.parseInt(sc.nextLine());
        int daysPerBook = Integer.parseInt(sc.nextLine());
        System.out.println((pages / pagesPerHour) / daysPerBook);
    }
}
