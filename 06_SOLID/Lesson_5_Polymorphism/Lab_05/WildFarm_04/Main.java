package OOP.Lesson_5_Polymorphism.Lab_05.WildFarm_04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int lineCount = 0;

        String input = scanner.nextLine();
        while (!input.equals("End")){

            String  [] element = input.split("\\s+");
            if (lineCount %2 == 0){
                String animalType = element[0];
                String animalName = element[1];
                Double animalWeight = Double.parseDouble(element[2]);
                String animalLivingRegion = element[3];
                if (animalType.equals("Cat")){
                    String breed = element[4];
                }

            }else {

            }

            lineCount ++;
            input = scanner.nextLine();

        }

    }
}
