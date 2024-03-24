package OOP.Lesson_2_Encapsulation.Exercise_2.AnimalFarm_02;

public class Chicken {
    //name: String
    //age: int

    private String name;
    private int age;

    public Chicken(String name, int age) {
        setName(name);
        setAge(age);
    }

    private void setName(String name) {
        if (name.length() >= 1) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Name cannot be empty.");
        }
    }

    private void setAge(int age) {
        if (age >= 0 && age <= 15) {
            this.age = age;
        } else {
            throw new IndexOutOfBoundsException("Age should be between 0 and 15.");
        }
    }

    public double productPerDay() {
        return calculateProductPerDay();

    }

    @Override
    public String toString() {
        //Chicken Choko (age 6) can produce 1.00 eggs per day.
        return String.format("Chicken %s (age %d) can produce %.2f eggs per day.",this.name,this.age,this.productPerDay());

    }

    private double calculateProductPerDay() {
        //•	First 6 years it produces 2 eggs per day [0 - 5].
        //•	Next 6 years it produces 1 egg per day [6 - 11].
        //•	And after that, it produces 0.75 eggs per day.
        if (this.age >=0 && this.age <= 5){
            return 2;
        }else if (this.age >=6 && this.age <=11){
            return 1;
        }else {
            return 0.75;
        }

    }
}
