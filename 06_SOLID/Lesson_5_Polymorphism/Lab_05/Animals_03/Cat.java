package OOP.Lesson_5_Polymorphism.Lab_05.Animals_03;

public class Cat extends Animal{

    public Cat(String name, String favouriteFood) {
        super(name, favouriteFood);
    }

    @Override
    public String explainSelf() {
        return String.format("I am %s and my favourite food is %s%nMEEOW ",super.getName(),super.getFavouriteFood());
    }
}
