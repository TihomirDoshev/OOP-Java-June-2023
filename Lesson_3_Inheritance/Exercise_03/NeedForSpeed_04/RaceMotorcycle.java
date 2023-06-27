package OOP.Lesson_3_Inheritance.Exercise_03.NeedForSpeed_04;

public class RaceMotorcycle extends Motorcycle{
    private final static double DEFAULT_FUEL_CONSUMPTION = 8;
    public RaceMotorcycle(double fuel, int horsePower) {
        super(fuel, horsePower);
        this.setFuelConsumption(DEFAULT_FUEL_CONSUMPTION);
    }
}
