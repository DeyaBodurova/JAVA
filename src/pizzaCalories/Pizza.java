package pizzaCalories;

public class Pizza {
    private String name;
    List <Dough> dought;

- toppings: List<Topping>

+ Piza (String, int numberOfToppings)

- setToppings(int) : void

- setName(String) : void

+ setDough(Dough) : void

+ getName(): String

+ addTopping (Topping) : void

+ getOverallCalories () : double
}
