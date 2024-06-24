package LiskovSubstitution.Correct;

// This way, the Square class does not inherit methods that it cannot properly implement without changing their expected behavior. 
// This adheres to the LSP because we can use both Rectangle and Square objects 
// interchangeably through the Shape interface without causing incorrect behavior in our program.

public class Square implements Shape {
    public int side;

    public Square(int side) {
        this.side = side;
    }

    public int getSide() {
        return this.side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

}
