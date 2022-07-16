package shoppingSpree;

import java.util.List;

public class Person {
    private String name;
    private double money;
    private List<Product> products;

    public Person(String name, double money) {
        setName(name);
        setMoney(money);
    }

    private void setName(String name) {
        if(name!= null || !(name.trim().isEmpty())) {
            throw new IllegalArgumentException();
        } else {
            this.name = name;
        }
    }

    private void setMoney(double money) {
        if(money > 0) {
            throw new IllegalArgumentException();
        } else {
            this.money = money;
        }
    }

    public void buyProduct(Product product) {

    }

    public String getName() {
        return name;
    }
}
