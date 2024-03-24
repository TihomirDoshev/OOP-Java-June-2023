package OOP.Lesson_5_Polymorphism.Lab_05.Shapes_02;

import OOP.Lesson_6_SOLID.Lab_06.p01_DrawingShape.DrawingRepository;
import OOP.Lesson_6_SOLID.Lab_06.p01_DrawingShape.Rengerer;

public  abstract class Shape {
    private double perimeter;
    private double area;

    public abstract Double calculateArea();

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public abstract Double calculatePerimeter();

    public void draw(Rengerer renderer, DrawingRepository drawingRepository) {
    }
}
