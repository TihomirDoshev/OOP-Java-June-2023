package OOP.Lesson_2_Encapsulation.Exercise_2.PizzaCalories_04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String pizzaData = scanner.nextLine();

        //o	Pizza {pizzaName} {numberOfToppings}

        String pizzaName = pizzaData.split("\\s+")[1];
        int toppingNumber = Integer.parseInt(pizzaData.split("\\s+")[2]);

        Pizza pizza = new Pizza(pizzaName,toppingNumber);

        String doughData = scanner.nextLine();

        //o	Dough {flourType} {bakingTechnique} {weightInGrams}

        String flourType = doughData.split("\\s+")[1];
        String bakingTechnique = doughData.split("\\s+")[2];
        double weightInGrams = Double.parseDouble(doughData.split("\\s+")[3]);

        Dough dough = new Dough(flourType,bakingTechnique,weightInGrams);

        pizza.setDough(dough);


        String toppingData = scanner.nextLine();

        while (!toppingData.equals("END")){
            //o	Topping {toppingType} {weightInGrams}
            String toppingType = toppingData.split("\\s+")[1];
            double toppingWeight = Double.parseDouble(toppingData.split("\\s+")[2]);
            Topping topping = new Topping(toppingType,toppingWeight);
            pizza.addTopping(topping);

            toppingData = scanner.nextLine();

        }
        System.out.printf("%s - %.2f",pizza.getName(),pizza.getOverallCalories());

    }
}
