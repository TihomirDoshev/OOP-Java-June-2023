package OOP.Lesson_5_Polymorphism.Exercise_05.Vehicles_01;

public class Car extends Vehicle {
    private static final Double AIR_CONDITION_CONSUMPTION = 0.9;

    public Car(double fuelQuantity, double litersPerKM) {
        super(fuelQuantity, litersPerKM + AIR_CONDITION_CONSUMPTION);
    }
}
