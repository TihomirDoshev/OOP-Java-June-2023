package OOP.Lesson_1_Working_With_Abstraction.Exercise_1.JediGalaxy_05;


import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int[] dimensions = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int rows = dimensions[0];
        int cols = dimensions[1];

        int[][] matrix = new int[rows][cols];

        int value = 0;
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < cols; j++)
            {
                matrix[i][j] = value++;
            }
        }

        String command = scanner.nextLine();
        long sum = 0;
        while (!command.equals("Let the Force be with you"))
        {
            int[] heroCoordinates = Arrays.stream(command.split(" ")).mapToInt(Integer::parseInt).toArray();
            int[] evilCoordinates = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int evilRow = evilCoordinates[0];
            int evilCol = evilCoordinates[1];

            while (evilRow >= 0 && evilCol >= 0)
            {
                if (evilRow < matrix.length && evilCol < matrix[0].length)
                {
                    matrix[evilRow] [evilCol] = 0;
                }
                evilRow--;
                evilCol--;
            }

            int heroRow = heroCoordinates[0];
            int heroCol = heroCoordinates[1];

            while (heroRow >= 0 && heroCol < matrix[1].length)
            {
                if (heroRow < matrix.length && heroCol >= 0 && heroCol < matrix[0].length)
                {
                    sum += matrix[heroRow][heroCol];
                }

                heroCol++;
                heroRow--;
            }

            command = scanner.nextLine();
        }

        System.out.println(sum);


    }

}