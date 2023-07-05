package OOP.Lesson_04_Interfaces_And_Abstraction.Lab_04.BorderControl_05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<Identifiable> identifiables = new ArrayList<>();

        while (!input.equals("End")){
            String[] tokens = input.split("\\s+");



            input = scanner.nextLine();

        }

    }
}
