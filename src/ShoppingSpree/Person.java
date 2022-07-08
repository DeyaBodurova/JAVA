package ShoppingSpree;

import java.util.List;

public class Person {

    private String name;
    private double money;
    private List<Product> products;

    public Person(String name, double money) {
        this.name = name;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }


    private void setMoney(double money) {
        if(money < 0) {
            throw new IllegalArgumentException();
        }
        this.money = money;
    }

   public void buyProduct(Product product) {

   }

}
