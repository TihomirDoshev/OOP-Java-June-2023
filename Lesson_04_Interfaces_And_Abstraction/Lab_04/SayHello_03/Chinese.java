package OOP.Lesson_04_Interfaces_And_Abstraction.Lab_04.SayHello_03;

public class Chinese implements Person{
    private String name;

    public Chinese(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String sayHello() {
        return "Djydjybydjy";
    }
}
