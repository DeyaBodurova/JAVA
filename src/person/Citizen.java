package person;

public class Citizen implements Person,Birthable,Identifiable {
    private String name;
    private int age;
    private String id;
    private String birthDay;

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Citizen(String name, int age, String id, String birthDay) {
        setName(name);
        setAge(age);
        setId(id);
        setBirthDay(birthDay);
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
        return birthDay;
    }

    @Override
    public String getId() {
        return id;
    }
}
