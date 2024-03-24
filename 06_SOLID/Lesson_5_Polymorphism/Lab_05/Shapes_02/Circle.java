package OOP.Lesson_5_Polymorphism.Lab_05.Shapes_02;

public class Circle extends Shape {

    //o	radius: Double
    private Double radius;

    public Circle(double radius) {
        this.radius = radius;
        this.setPerimeter(this.calculatePerimeter());
        this.setRadius(this.calculateArea());
    }

    @Override
    public Double calculateArea() {
        super.setArea(Math.PI*(radius*radius));
        return super.getArea();
    }

    @Override
    public Double calculatePerimeter() {
        super.setPerimeter(2 * Math.PI * radius);
        return super.getPerimeter();
    }

    public final Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }
}
