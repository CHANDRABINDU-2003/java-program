package inheritance;
class Shape {
    public void printShape() {
        System.out.println("This is shape");
    }
}

class Rectangle extends Shape {
    @Override
    public void printShape() {
        System.out.println("This is rectangular shape");
    }
}

class Circle extends Shape {
    @Override
    public void printShape() {
        System.out.println("This is circular shape");
    }
}

class Square extends Rectangle {
    public void printSquare() {
        System.out.println("Square is a rectangle");
    }
}
public class Inheritance06 {
    public static void main(String[] args) {
        Square square = new Square();
        square.printShape();
        square.printSquare();
        Circle circle = new Circle();
        circle.printShape();
    }
}
