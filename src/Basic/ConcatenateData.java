package Basic;

import java.util.Scanner;

public class ConcatenateData {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String lastName = sc.nextLine();
        int age = Integer.parseInt(sc.nextLine());
        String city = sc.nextLine();
        System.out.printf("You are %s %s, a %d-years old OOP.OOP.OOP.OOP.person from %s.", name, lastName, age, city);
    }
}
//    Напишете програма, която прочита от конзолата име, фамилия, възраст и град
//    и печата следното съобщение: "You are <firstName> <lastName>, a <age>-years old OOP.OOP.OOP.OOP.person from <town>."