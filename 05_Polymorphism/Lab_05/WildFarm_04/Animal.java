package OOP.Lesson_5_Polymorphism.Lab_05.WildFarm_04;

public abstract class Animal {

    private String animalName;
    private String animalType;
    private Double animalWeight;
    private Integer foodEaten;

    public abstract void makeSound();
    public abstract void eat(Food food);

    public Animal(String animalName, String animalType, Double animalWeight, Integer foodEaten) {
        this.animalName = animalName;
        this.animalType = animalType;
        this.animalWeight = animalWeight;
        this.foodEaten = foodEaten;
    }
}
