package OOP.Lesson_2_Encapsulation.Exercise_2.PizzaCalories_04;

public class Topping {
    //toppingType: String
    //weight: double
    private String toppingType;
    private double weight;

    public Topping(String toppingType, double weight) {
        setToppingType(toppingType);
        setWeight(weight);

    }

    private void setToppingType(String toppingType) {
        //•	Meat – 1.2;
        //•	Veggies – 0.8;
        //•	Cheese – 1.1;
        //•	Sauce – 0.9;
        if (toppingType.equals("Meat") || toppingType.equals("Veggies") || toppingType.equals("Cheese") || toppingType.equals("Sauce")) {
            this.toppingType = toppingType;
        }else {
            throw new IllegalArgumentException("Cannot place "+ toppingType +" on top of your pizza.");
        }
    }

    private void setWeight(double weight) {
        if (weight >= 1 && weight <= 50 ) {
            this.weight = weight;
        }else {
            throw new IllegalArgumentException( this.toppingType +" weight should be in the range [1..50].");
        }
    }
    public double calculateCalories(){
        double toppingCoefficient = 0;
        switch (toppingType){
            case "Meat":
                toppingCoefficient = 1.2;
                break;
            case "Veggies":
                toppingCoefficient = 0.8;
                break;
            case "Cheese":
                toppingCoefficient = 1.1;
                break;
            case "Sauce":
                toppingCoefficient = 0.9;
                break;
        }
        return (2 * weight) * toppingCoefficient;


    }
}
