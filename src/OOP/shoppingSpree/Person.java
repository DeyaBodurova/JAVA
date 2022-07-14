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
        if(name!= null && (!name.trim().isEmpty())) {
            this.name = name;
        }
    }

    public double getMoney() {
        return money;
    }

    private void setMoney(double money) {
        if (money >= 0) {
            this.money = money;
        }
    }

    public void buyProduct(Product product) {
        if(money >= product.getCost()) {
            products.add(product);
        } else {
            throw new IllegalArgumentException(String.format("%s can't afford %s", name, product.getName());
        }

    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", money=" + money +
                ", products=" + products +
                '}';
    }
}
