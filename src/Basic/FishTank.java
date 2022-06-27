package Basic;

import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = Integer.parseInt(sc.nextLine());
        int width = Integer.parseInt(sc.nextLine());
        int height = Integer.parseInt(sc.nextLine());
        double percent = Double.parseDouble(sc.nextLine());
        double volume = length * width * height;
        double volumeLitters = volume * 0.001;
        double neededLitters = volumeLitters * (1 - (percent * 0.01));
        System.out.println(neededLitters);
    }
}
