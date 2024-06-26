package OOP.Lesson_5_Polymorphism.Exercise_05.Vehicles_01;

public class Truck extends Vehicle {
    private static final double AIR_CONDITION_CONSUMPTION = 1.6;

    public Truck(double fuelQuantity, double litersPerKM) {
        super(fuelQuantity, litersPerKM + AIR_CONDITION_CONSUMPTION);
    }

    public double getTINY_WHOLE_LOSES() {
        return 0.05;
    }
}
