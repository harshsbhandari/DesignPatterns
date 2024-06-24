package OpenClose.Correct;

public class Circle implements Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

}
