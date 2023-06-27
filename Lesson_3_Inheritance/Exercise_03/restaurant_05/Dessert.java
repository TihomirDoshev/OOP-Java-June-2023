package OOP.Lesson_3_Inheritance.Exercise_03.restaurant_05;

import java.math.BigDecimal;

public class Dessert extends Food{
    //•	calories – double
    //•	Getter for calories
    private double calories;

    public Dessert(String name, BigDecimal price, double grams, double calories) {
        super(name, price, grams);
        this.calories = calories;
    }

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }
}
