package OOP.Lesson_3_Inheritance.Exercise_03.NeedForSpeed_04;

public class Car extends Vehicle{
    private final static double DEFAULT_FUEL_CONSUMPTION = 3;
    public Car(double fuel, int horsePower) {
        super(fuel, horsePower);
        this.setFuelConsumption(DEFAULT_FUEL_CONSUMPTION);
    }
}
