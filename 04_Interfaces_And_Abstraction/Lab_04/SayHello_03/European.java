package OOP.Lesson_04_Interfaces_And_Abstraction.Lab_04.SayHello_03;

public class European implements Person{
    //-name: String
    //+sayHello(): String
    private String name;

    public European(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String sayHello() {
        return "Hello";
    }
}
