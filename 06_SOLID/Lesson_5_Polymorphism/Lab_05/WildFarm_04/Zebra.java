package OOP.Lesson_5_Polymorphism.Lab_05.WildFarm_04;

public class Zebra extends Mammal{
    public Zebra(String animalName, String animalType, Double animalWeight, Integer foodEaten, String livingRegion) {
        super(animalName, animalType, animalWeight, foodEaten, livingRegion);
    }

    @Override
    public void makeSound() {

    }

    @Override
    public void eat(Food food) {

    }
}
