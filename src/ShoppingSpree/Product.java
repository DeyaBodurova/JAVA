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
        if (name == null || name.trim().equals("")) {
            throw new IllegalArgumentException();
        }
        this.name = name;
    }

    private void setCost(double cost) {
        if(cost < 0) {
            throw new IllegalArgumentException();
        }
        this.cost = cost;
    }
}
