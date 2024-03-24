package OOP.Lesson_04_Interfaces_And_Abstraction.Exercise_04.BirthdayCelebrations_03;

public class Citizen implements Birthable,Identifiable{
    //name: String
    //age: int
    //id: String
    //birthDate: String

    private String name;
    private int age;
    private String id;
    private String birthDate;

    public Citizen(String name, int age, String id, String birthDate) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.birthDate = birthDate;
    }

    @Override
    public String getBirthDate() {
        return this.birthDate;
    }

    @Override
    public String getId() {
        return this.id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
