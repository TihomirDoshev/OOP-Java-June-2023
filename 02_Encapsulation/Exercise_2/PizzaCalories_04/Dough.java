package OOP.Lesson_2_Encapsulation.Exercise_2.PizzaCalories_04;

public class Dough {
    //flourType: String
    //bakingTechnique: String
    //weight: double
    private String flourType;
    //•	White – 1.5;
    //•	Wholegrain – 1.0;
    private String bakingTechnique;
    //•	Crispy – 0.9;
    //•	Chewy – 1.1;
    //•	Homemade – 1.0;
    private double weight;
    //1-200

    public Dough(String flourType, String bakingTechnique, double weight) {
        setFlourType(flourType);
        setBakingTechnique(bakingTechnique);
        setWeight(weight);

    }

    private void setFlourType(String flourType) {
        if (flourType.equals("White") || flourType.equals("Wholegrain")){
            this.flourType = flourType;
        }else {
            throw new IllegalArgumentException("Invalid type of dough.");
        }
    }

    private void setBakingTechnique(String bakingTechnique) {
        if (bakingTechnique.equals("Crispy") || bakingTechnique.equals("Chewy") || bakingTechnique.equals("Homemade")){
            this.bakingTechnique = bakingTechnique;
        }else {
            throw new IllegalArgumentException("Invalid type of dough.");
        }
    }

    private void setWeight(double weight) {
        if (weight >= 1 && weight <=200){
            this.weight = weight;
        }else {
            throw new IllegalArgumentException("Dough weight should be in the range [1..200].");
        }
    }
    public double calculateCalories(){
       // 2 * weight * coefficientFlour * coefficientBaking
        double coefficientFlour = 0;
        if (flourType.equals("White")){
            coefficientFlour = 1.5;
        }else if (flourType.equals("Wholegrain")){
            coefficientFlour = 1.0;
        }
        double coefficientBaking = 0;
        if (bakingTechnique.equals("Crispy")){
            coefficientBaking = 0.9;
        }else if (bakingTechnique.equals("Chewy")){
            coefficientBaking = 1.1;
        }else if (bakingTechnique.equals("Homemade")){
            coefficientBaking = 1.0;
        }
        double sum  = (2 * weight) * coefficientFlour * coefficientBaking;

        return sum;

    }
}
