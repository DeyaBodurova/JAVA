package person;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        List<Birthable> creatures = new ArrayList<>();

        while (!input.equals("End")) {
            String[] data = input.split("\\s+");
            String type = data[0];
            switch (type) {
                case "Citizen":
                    String[] dateData = data[4].split("/");
                    int yearOfBirth = Integer.parseInt(dateData[2]);
                    Citizen citizen = new Citizen(data[1], Integer.parseInt(data[2]), data[3], data[4]);
                    creatures.add(citizen);
                    break;
                case "Pet":
                    String[] dateDataOfPet = data[2].split("/");
                    int yearOfBirthOfPet = Integer.parseInt(dateDataOfPet[2]);
                    Pet pet = new Pet(data[1], data[2]);
                    creaturesYearsOfBirth.put(yearOfBirthOfPet, pet);
                    break;
                case "Robot":
                    Robot robot = new Robot(data[1], data[2]);
                    break;
            }
            input = sc.nextLine();
        }
        int year = Integer.parseInt(sc.nextLine());
        if (creaturesYearsOfBirth.containsKey(year)) {
            creaturesYearsOfBirth.entrySet().removeIf(c -> !c.getKey().equals(year));
            creaturesYearsOfBirth.forEach(c -> c.);
        }

    }
}
