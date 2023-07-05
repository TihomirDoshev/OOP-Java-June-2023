package OOP.Lesson_04_Interfaces_And_Abstraction.Exercise_04.BirthdayCelebrations_03;

public class Pet implements Birthable{
    //name: String
    //birthDate: String
    private String name;
    private String birthDate;

    public Pet(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    @Override
    public String getBirthDate() {
        return this.birthDate;
    }

    public String getName() {
        return name;
    }
}
