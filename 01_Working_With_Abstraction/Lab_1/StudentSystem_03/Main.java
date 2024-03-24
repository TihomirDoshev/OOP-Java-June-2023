package OOP.Lesson_1_Working_With_Abstraction.Lab_1.StudentSystem_03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StudentSystem studentSystem = new StudentSystem();

        boolean isRunning = true;

        while (isRunning) {
            String[] input = scanner.nextLine().split(" ");

            String output = studentSystem.parseCommand(input);

            isRunning = !"Exit".equals(output);

            if (output != null && isRunning) {
                System.out.println(output);
            }
        }
    }
}
