package OOP.Lesson_5_Polymorphism.Lab_05.Shapes_02;

public class Rectangle extends Shape{
    //o	height: Double
    //o	width: Double
    private Double height;
    private Double width;


    public Rectangle(Double height, Double width) {
        this.height = height;
        this.width = width;
        this.setArea(this.calculateArea());
        this.setPerimeter(this.calculatePerimeter());
    }
    @Override
    public Double calculateArea(){
        super.setArea(width * height);
        return super.getArea();

    }
    @Override
    public Double calculatePerimeter(){
        super.setPerimeter(2 * width + 2 * height);
        return super.getPerimeter();

    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }
}
