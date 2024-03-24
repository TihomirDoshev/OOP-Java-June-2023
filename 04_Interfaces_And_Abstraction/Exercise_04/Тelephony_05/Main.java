package OOP.Lesson_04_Interfaces_And_Abstraction.Exercise_04.Тelephony_05;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String[] phoneNumbers = scanner.nextLine().split("\\s+");
        String[] urls = scanner.nextLine().split("\\s+");

        Smartphone smartphone = new Smartphone(List.of(phoneNumbers), List.of(urls));

        System.out.println(smartphone.call());
        System.out.println(smartphone.browse());
    }
}
