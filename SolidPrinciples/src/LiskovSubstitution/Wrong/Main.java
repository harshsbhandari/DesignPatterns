package LiskovSubstitution.Wrong;

public class Main {
    // In the above example, the Square class violates the LSP 
    // because it modifies the behavior of setSide1 and setSide2 methods 
    // in a way that is not consistent with the Rectangle class
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setSide1(3);
        rectangle.setSide2(5);
        System.out.println("Rectangle area: " + rectangle.getArea()); // Outputs 20

        Rectangle square = new Square();
        square.setSide1(3);
        square.setSide2(4);
        System.out.println("Square area: " + square.getArea()); // Outputs 16
    }
}
