package foodShortage;

public class Citizen implements Buyer, Person, Identifiable {
    private String name;
    private int age;
    private String id;
    private String birthDate;
    private int food;

    public Citizen(String name, int age, String id, String birthDate) {

    }

    public String getName() {
return  name;
    }

    public int getAge() {
return  age;
    }

    public String getId() {
return  id;
    }

    @Override
    public int getFood() {
return food;
    }

    public void buyFood() {
food+=10;
    }

}
