package OOP.Lesson_04_Interfaces_And_Abstraction.Lab_04.CarShopExtend_02;

public class CarImpl implements Car{
    private final String model;
    private final Integer horsePower;
    private final String color;
    private final String countryProduced;

    public CarImpl(String model, String color, Integer horsePower,
                   String countryProduced) {
        this.model = model;
        this.color = color;
        this.horsePower = horsePower;
        this.countryProduced = countryProduced;
    }

        @Override
        public String getModel () {
            return this.model;
        }

        @Override
        public String getColor () {
            return this.color;
        }

        @Override
        public Integer getHorsePower () {
            return this.horsePower;
        }

        @Override
        public String countryProduced () {
            return this.countryProduced;
        }

        @Override
        public String toString () {
            return "This is " + model + " produced in "
                    + countryProduced + " and have " +
                    Car.Tires + " tires";
        }
    }




