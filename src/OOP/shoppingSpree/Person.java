package OOP.shoppingSpree;

import java.util.List;

public class Person {
    private String name;
    private double money;
    private List<Product> products;

    public Person(String name, double money) {
        setName(name);
        setMoney(money);
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    private void setMoney(double money) {
        this.money = money;
    }


    public void buyProduct(Product product) {

    }

}
