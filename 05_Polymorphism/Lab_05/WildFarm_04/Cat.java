package OOP.Lesson_5_Polymorphism.Lab_05.WildFarm_04;

public class Cat extends Felime{

    private String breed;


    public Cat(String animalName,
               String animalType,
               Double animalWeight,
               Integer foodEaten,
               String livingRegion,
               String breed) {
        super(animalName, animalType, animalWeight, foodEaten, livingRegion);
        this.breed = breed;
    }
}
