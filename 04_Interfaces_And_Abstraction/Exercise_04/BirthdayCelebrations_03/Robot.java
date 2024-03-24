package OOP.Lesson_04_Interfaces_And_Abstraction.Exercise_04.BirthdayCelebrations_03;

public class Robot implements Identifiable{
    //-	id: String
    //-	model: String
    private String id;
    private String model;

    public Robot(String id, String model) {
        this.id = id;
        this.model = model;
    }

    @Override
    public String getId() {
        return this.id;
    }

    public String getModel() {
        return model;
    }
}
