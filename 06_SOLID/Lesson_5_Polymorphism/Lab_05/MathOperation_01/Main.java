package OOP.Lesson_5_Polymorphism.Lab_05.MathOperation_01;

public class Main {
    public static void main(String[] args) {
        MathOperation mathOperation = new MathOperation();

        System.out.println(mathOperation.add(1, 2));
        System.out.println(mathOperation.add(1, 2, 3));
        System.out.println(mathOperation.add(1, 2, 3, 4));
    }
}
