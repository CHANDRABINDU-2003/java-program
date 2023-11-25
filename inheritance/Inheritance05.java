package inheritance;
class Rectangle {
    double length;
    double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double calculateArea() {
        return length * breadth;
    }
}

class Square extends Rectangle {
    public Square(double side) {
        super(side, side);
    }
}
public class Inheritance05 {
    public static void main(String[] args) {
        Square[] squares = new Square[15]; 
        for (int i = 0; i < squares.length; i++) {
            double side = i + 1;
            squares[i] = new Square(side);
        }
        for (int i = 0; i < squares.length; i++) {
            double area = squares[i].calculateArea();
            System.out.println("Area of Square " + (i + 1) + ": " + area);
        }
    }
}
