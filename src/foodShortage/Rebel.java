package foodShortage;

public class Rebel implements Buyer, Person {
    private String name;
    private int age;
    private String group;
    private int food;

    public Rebel(String name, int age, String group) {

    }

    public String getName() {
return name;
    }

    public int getAge() {
return  age;
    }

    public String getGroup() {
return  group;
    }

@Override
    public int getFood() {
return  food;
    }

    @Override
    public void buyFood() {

    }
}
