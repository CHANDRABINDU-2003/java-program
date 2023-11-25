package inheritance;
class Point {
    private double x;
    private double y;
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
}
class Quadrilateral {
    private Point point1;
    private Point point2;
    private Point point3;
    private Point point4;

    public Quadrilateral(Point p1, Point p2, Point p3, Point p4) {
        point1 = p1;
        point2 = p2;
        point3 = p3;
        point4 = p4;
    }

    public double getArea() {
        return 0.0;
    }
}
class Trapezoid extends Quadrilateral {
    public Trapezoid(Point p1, Point p2, Point p3, Point p4) {
        super(p1, p2, p3, p4);
    }

    @Override
    public double getArea() {
        return 0.0;
    }
}

class Parallelogram extends Quadrilateral {
    public Parallelogram(Point p1, Point p2, Point p3, Point p4) {
        super(p1, p2, p3, p4);
    }

    @Override
    public double getArea() {
        return 0.0;
    }
}

class Rectangle extends Parallelogram {
    public Rectangle(Point p1, Point p2, Point p3, Point p4) {
        super(p1, p2, p3, p4);
    }

    @Override
    public double getArea() {
        return 0.0;
    }
}

class Square extends Rectangle {
    public Square(Point p1, Point p2, Point p3, Point p4) {
        super(p1, p2, p3, p4);
    }

    @Override
    public double getArea() {
        return 0.0;
    }
}

public class Inheritance07 {
    public static void main(String[] args) {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(4, 0);
        Point p3 = new Point(4, 3);
        Point p4 = new Point(0, 3);
        Quadrilateral quadrilateral = new Quadrilateral(p1, p2, p3, p4);
        Trapezoid trapezoid = new Trapezoid(p1, p2, p3, p4);
        Parallelogram parallelogram = new Parallelogram(p1, p2, p3, p4);
        Rectangle rectangle = new Rectangle(p1, p2, p3, p4);
        Square square = new Square(p1, p2, p3, p4);

        System.out.println("Quadrilateral Area: " + quadrilateral.getArea());
        System.out.println("Trapezoid Area: " + trapezoid.getArea());
        System.out.println("Parallelogram Area: " + parallelogram.getArea());
        System.out.println("Rectangle Area: " + rectangle.getArea());
        System.out.println("Square Area: " + square.getArea());
    }
}
