package OOP.Lesson_5_Polymorphism.Lab_05.WildFarm_04;

public abstract class Mammal extends Animal{

    private String livingRegion;

    public Mammal(String animalName, String animalType, Double animalWeight, Integer foodEaten, String livingRegion) {
        super(animalName, animalType, animalWeight, foodEaten);
        this.livingRegion = livingRegion;
    }
}
