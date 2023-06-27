package OOP.Lesson_1_Working_With_Abstraction.Lab_1.PointInRectangle_02;

public class Rectangle {
    private Point2D bottomLeft;
    private Point2D topRight;

    public Rectangle(Point2D bottomLeft, Point2D topRight) {
        this.bottomLeft = bottomLeft;
        this.topRight = topRight;
    }

    public boolean contains(Point2D point) {
        return this.bottomLeft.isGreaterOrEqual(point)
                && this.topRight.isLessOrEqual(point);
    }
}
