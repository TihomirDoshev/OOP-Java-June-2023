package OOP.Lesson_2_Encapsulation.Lab_2.sortByNameAndAge_01;

public class Person {
    //•	firstName: String
    //•	lastName: String
    //•	age: int
    //•	toString() - override

    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return String.format("%s %s is %d years old.",getFirstName(),getLastName(),getAge());
    }
}
