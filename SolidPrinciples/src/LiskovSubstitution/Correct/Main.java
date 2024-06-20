package LiskovSubstitution.Correct;

public class Main {
    // LSP states that objects of a superclass should be replaceable 
    // with objects of a subclass without affecting the correctness of the program. 
    // This principle ensures that a subclass can stand in for its superclass 
    // without causing unexpected behaviors.
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(4, 5);
        System.out.println("Rectangle area: " + rectangle.getArea()); // Outputs 20

        Shape square = new Square(4);
        System.out.println("Square area: " + square.getArea()); // Outputs 16
    }
}
