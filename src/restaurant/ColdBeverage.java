package restaurant;

import java.math.BigDecimal;

public class ColdBeverage extends Beverages{
    private String name;
    private BigDecimal price;
    private double milliliters;

    public ColdBeverage(String name, BigDecimal price, double milliliters) {
        super(name, price, milliliters);
    }
}
