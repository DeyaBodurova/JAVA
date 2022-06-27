package Basic;

import java.util.Scanner;

public class AreasOfFigures {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String type = sc.nextLine();
        double area = 0;
        switch (type) {
            case "square":
                double length = Double.parseDouble(sc.nextLine());
                area = length * length;
                break;
            case "rectangle":
                double lengthA = Double.parseDouble(sc.nextLine());
                double lengthB = Double.parseDouble(sc.nextLine());
                area = lengthA * lengthB;
                break;
            case "circle":
                double radius = Double.parseDouble(sc.nextLine());
                area = Math.PI * (radius * radius);
                break;
            case "triangle":
                double lengthT = Double.parseDouble(sc.nextLine());
                double height = Double.parseDouble(sc.nextLine());
                area = (lengthT * height) / 2;
                break;
        }
        System.out.println(area);
    }
}