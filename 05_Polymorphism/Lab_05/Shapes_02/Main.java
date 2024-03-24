package OOP.Lesson_5_Polymorphism.Lab_05.Shapes_02;

public class Main {
    public static void main(String[] args){
        Shape shape =  new Rectangle(4.0,5.0);
        System.out.println(shape.calculateArea());
        System.out.println(shape.calculatePerimeter());
    }


}
