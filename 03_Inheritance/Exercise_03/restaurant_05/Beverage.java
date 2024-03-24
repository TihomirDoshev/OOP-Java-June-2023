package OOP.Lesson_3_Inheritance.Exercise_03.restaurant_05;

import java.math.BigDecimal;

public class Beverage extends Product{
    //•	name – String
    //•	price – BigDecimal
    //•	milliliters - double
    //•	Getter for milliliters
    private double milliliters;

    public Beverage(String name, BigDecimal price, double milliliters) {
        super(name, price);
        this.milliliters = milliliters;
    }

    public double getMilliliters() {
        return milliliters;
    }

    public void setMilliliters(double milliliters) {
        this.milliliters = milliliters;
    }
}
