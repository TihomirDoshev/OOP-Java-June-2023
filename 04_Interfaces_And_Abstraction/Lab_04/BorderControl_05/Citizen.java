package OOP.Lesson_04_Interfaces_And_Abstraction.Lab_04.BorderControl_05;

public class Citizen implements Identifiable{
    private String name;
    private int age;
    private String id;

    public Citizen(String name, int age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String getId() {
        return id;
    }
    //name: String
    //age: int
    //id: String
    //Citizen(Stirng, int, String)
    //getName() : String
    //getAge() : int
    //getId() : String


}
