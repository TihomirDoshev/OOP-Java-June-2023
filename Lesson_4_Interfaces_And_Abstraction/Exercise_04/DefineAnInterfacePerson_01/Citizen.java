package OOP.Lesson_04_Interfaces_And_Abstraction.Exercise_04.DefineAnInterfacePerson_01;

public class Citizen implements Person{
    //-	name: String
    //-	age: int
    private String name;
    private int age;

    public Citizen(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getAge() {
        return this.age;
    }
}
