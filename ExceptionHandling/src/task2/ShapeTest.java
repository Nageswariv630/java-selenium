package task2;
abstract class Shape {
    abstract double area();

    void displayShapeType() {
        System.out.println("This is a shape.");
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double area() {
        return Math.PI * radius * radius;
    }

    @Override
    void displayShapeType() {
        System.out.println("This is a Circle.");
    }
}

class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double area() {
        return length * width;
    }

    @Override
    void displayShapeType() {
        System.out.println("This is a Rectangle.");
    }
}

public class ShapeTest {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);

        circle.displayShapeType();
        System.out.println("Area: " + circle.area());

        rectangle.displayShapeType();
        System.out.println("Area: " + rectangle.area());
    }
}

