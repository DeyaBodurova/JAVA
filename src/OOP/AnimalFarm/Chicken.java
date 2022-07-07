package OOP.AnimalFarm;

public class Chicken {
    private String name;
    private int age;

    public Chicken(String name, int age) {
        setName(name);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    private void setName(String name) {
        if (name.length() < 1) {
            return;
        }
        this.name = name;
    }

    private void setAge(int age) {
        this.age = age;
    }

    public double productPerDay() {
        if(age <= 6 && age >= 0) {
            return 2;
        } else if(age > 6 && age <= 11) {
            return 1;
        } else {
            return 0.75;
        }
    }
}
