package inheritance;
class Rectangle {
    double length;
    double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public void printArea() {
        double area = length * breadth;
        System.out.println("Rectangle Area: " + area);
    }

    public void printPerimeter() {
        double perimeter = 2 * (length + breadth);
        System.out.println("Rectangle Perimeter: " + perimeter);
    }
}

class Square extends Rectangle {
    public Square(double side) {
        super(side, side);
    }
}

public class Inheritance04 {
     public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5.0, 4.0);
        Square square = new Square(4.0);
        System.out.println("Rectangle Details:");
        rectangle.printArea();
        rectangle.printPerimeter();
        System.out.println();
        System.out.println("Square Details:");
        square.printArea();
        square.printPerimeter();
    }
}
