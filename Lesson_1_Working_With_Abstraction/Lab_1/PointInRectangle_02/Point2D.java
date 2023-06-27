package OOP.Lesson_1_Working_With_Abstraction.Lab_1.PointInRectangle_02;

public class Point2D {
    public int x;
    public int y;

    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean isLessOrEqual(Point2D point) {
        return point.x <= this.x && point.y <= this.y;
    }

    public boolean isGreaterOrEqual(Point2D point) {
        return point.x >= this.x && point.y >= this.y;
    }
}
