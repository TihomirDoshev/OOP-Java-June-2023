package OOP.Lesson_04_Interfaces_And_Abstraction.Lab_04.BorderControl_05;

public class Robot implements Identifiable{
    //id: String
    //model: String
    //Robot(Stirng, String)
    //getId() : String
    //getModel() : String

    private String model;
    private String id;

    public Robot(String model, String id) {
        this.model = model;
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String getId() {
        return this.id;
    }
}
