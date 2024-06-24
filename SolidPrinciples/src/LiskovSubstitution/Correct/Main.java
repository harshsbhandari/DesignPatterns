package LiskovSubstitution.Correct;

public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(4, 5);
        System.out.println("Rectangle area: " + rectangle.getArea()); // Outputs 20

        Shape square = new Square(4);
        System.out.println("Square area: " + square.getArea()); // Outputs 16
    }
}
