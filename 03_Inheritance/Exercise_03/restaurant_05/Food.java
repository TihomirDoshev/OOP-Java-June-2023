package OOP.Lesson_3_Inheritance.Exercise_03.restaurant_05;

import java.math.BigDecimal;

public class Food extends Product{

    //•	name – String
    //•	price – double
    //•	grams - double
    //•	Getter for grams
    private double grams;

    public Food(String name, BigDecimal price, double grams) {
        super(name, price);
        this.grams = grams;
    }

    public double getGrams() {
        return grams;
    }

    public void setGrams(double grams) {
        this.grams = grams;
    }
}
