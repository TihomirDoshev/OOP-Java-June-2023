package OOP.Lesson_3_Inheritance.Exercise_03.restaurant_05;

import java.math.BigDecimal;

public class Salmon extends MainDish{
    //double SALMON_GRAMS = 22
    private static final double SALMON_GRAMS = 22;

    public Salmon(String name, BigDecimal price) {
        super(name, price, SALMON_GRAMS);
    }
}
