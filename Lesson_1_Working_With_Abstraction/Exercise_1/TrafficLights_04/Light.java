package OOP.Lesson_1_Working_With_Abstraction.Exercise_1.TrafficLights_04;

public class Light {

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    private Color color;

    public Light(Color color) {
        this.color = color;
    }

    public void changeColor() {
        // RED -> GREEN
        //GREEN -> YELLOW
        //YELLOW - RED
        switch (color) {
            case RED:
                this.color = Color.GREEN;
                break;
            case GREEN:
                this.color = Color.YELLOW;
                break;
            case YELLOW:
                this.color = Color.RED;
                break;

        }
    }

}
