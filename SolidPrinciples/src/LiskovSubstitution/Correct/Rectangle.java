package LiskovSubstitution.Correct;

public class Rectangle implements Shape {
    public int side1;
    public int side2;

    public Rectangle(int side1, int side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    public int getSide1() {
        return this.side1;
    }
    public int getSide2() {
        return this.side2;
    }

    public void setSide1(int side1) {
        this.side1 = side1;
    }
    public void setSide2(int side2) {
        this.side2 = side2;
    }

    @Override
    public double getArea() {
        return side1 * side2;
    }
    
}
