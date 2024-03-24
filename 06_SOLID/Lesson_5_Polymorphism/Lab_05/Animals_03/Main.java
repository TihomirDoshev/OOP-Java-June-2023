package OOP.Lesson_5_Polymorphism.Lab_05.Animals_03;

public class Main {
    public static void main(String[] args){
        Animal animal1 = new Cat("Tommy","Jerry");
        System.out.println(animal1.explainSelf());
        animal1 = new Dog("Rexy","Tommy");
        System.out.println(animal1.explainSelf());
    }
}
