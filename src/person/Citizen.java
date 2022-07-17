package person;

public class Citizen implements Person,Birthable,Identifiable {
    private String name;
    private int age;

    public Citizen(String name, int age) {
        setName(name);
        setAge(age);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String getBirthDay() {
        return null;
    }

    @Override
    public String getId() {
        return null;
    }
}
