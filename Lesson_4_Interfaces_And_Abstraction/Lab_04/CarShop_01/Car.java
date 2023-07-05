package OOP.Lesson_04_Interfaces_And_Abstraction.Lab_04.CarShop_01;

import java.io.Serializable;

public interface Car extends Serializable {
    public static final int Tires = 4;
    public String getModel();
    public String getColor();
    public Integer getHorsePower();
    public String countryProduced();


}
