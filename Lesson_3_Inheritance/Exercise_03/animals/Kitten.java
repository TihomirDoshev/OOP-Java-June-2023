package OOP.Lesson_3_Inheritance.Exercise_03.animals;

public class Kitten extends Cat{
    private static String gender = "Female";

    public Kitten(String name, int age) {
        super(name, age, gender);
    }

    public String produceSound() {
        return "Meow";
    }
}
