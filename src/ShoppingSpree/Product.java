package ShoppingSpree;

public class Product {

    private String name;
    private double cost;

    public Product(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }

    private void setName(String name) {
        if (name == null || name.length() < 1) {
            throw new IllegalArgumentException();
        }
        this.name = name;
    }

    private void setCost(double cost) {
        this.cost = cost;
    }
}
