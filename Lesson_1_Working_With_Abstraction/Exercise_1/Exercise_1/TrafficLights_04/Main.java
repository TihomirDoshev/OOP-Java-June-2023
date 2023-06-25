package OOP.Lesson_1_Working_With_Abstraction.Exercise_1.Exercise_1.TrafficLights_04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String [] colors = scanner.nextLine().split("\\s+");
        int num = Integer.parseInt(scanner.nextLine());

        List<Light> trafficLights = new ArrayList<>();

        for (String element : colors) {
            Light light = new Light(Color.valueOf(element));
            trafficLights.add(light);

        }
        for (int i = 0; i < num; i++) {
            for (Light element : trafficLights) {
                element.changeColor();
                System.out.println(element.getColor()+" ");

            }
            System.out.println();
            
        }


    }
}
