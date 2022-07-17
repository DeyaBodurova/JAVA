package pizzaCalories;

import java.util.List;

public class Pizza {
    private String name;
    private Dough dought;
    private List<Topping> toppings;

    public Pizza(String name, int numberOfToppings) {
        setName(name);

    }

    private void setName(String name) {
        this.name = name;
    }

    private void setToppings(int toppings) {

    }

    public void setDough(Dough dough) {

    }

    public String getName() {
        this.name = name;
    }

    public void addTopping(Topping topping) {

    }

    public double getOverallCalories() {

    }

}
