package OOP.Lesson_04_Interfaces_And_Abstraction.Lab_04.SayHelloExtended_04;

public abstract class BasePerson implements Person{
    //-name: String
    //#BasePerson(name)
    //+getName(): String
    //-setName(): void
    private String name;

    protected BasePerson(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    private void setName(String name) {
        this.name = name;
    }
}
