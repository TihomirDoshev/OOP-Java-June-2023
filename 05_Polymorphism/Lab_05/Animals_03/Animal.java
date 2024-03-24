package OOP.Lesson_5_Polymorphism.Lab_05.Animals_03;

public abstract class Animal {

    private String name;
    private String favouriteFood;
    public abstract String explainSelf();

    public Animal(String name, String favouriteFood) {
        this.name = name;
        this.favouriteFood = favouriteFood;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFavouriteFood() {
        return favouriteFood;
    }

    public void setFavouriteFood(String favouriteFood) {
        this.favouriteFood = favouriteFood;
    }
}



