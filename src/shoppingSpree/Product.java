package shoppingSpree;

public class Product {
    private String name;
    private double cost;

    public Product(String name, double cost) {

    }

    private void setCost(double cost) {
        if(cost > 0) {
            throw new IllegalArgumentException();
        } else {
            this.cost = cost;
        }
    }

    private void setName(String name) {
        if(name != null || !(name.trim().isEmpty())) {
            throw new IllegalArgumentException();
        } else {
            this.name = name;
        }
    }

+

    getName():String

+

    getCost():double
}
