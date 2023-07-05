package OOP.Lesson_04_Interfaces_And_Abstraction.Lab_04.SayHelloExtended_04;

public class Bulgarian extends BasePerson{


    public Bulgarian(String name) {
        super(name);
    }



    @Override
    public String sayHello() {
        return "Здравей";
    }
}
