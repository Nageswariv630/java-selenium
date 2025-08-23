package tasks1;

//Abstract class
abstract class Shape {
 // Abstract method
 abstract double area();
}

//Derived class: Circle
class Circle extends Shape {
 double radius;

 Circle(double radius) {
     this.radius = radius;
 }

 // Implementing abstract method
 @Override
 double area() {
     return Math.PI * radius * radius;
 }
}

//Derived class: Rectangle
class Rectangle extends Shape {
 double length, width;

 Rectangle(double length, double width) {
     this.length = length;
     this.width = width;
 }

 // Implementing abstract method
 @Override
 double area() {
     return length * width;
 }
}

//Main class to test
public class ShapeTest {
 public static void main(String[] args) {
     Shape circle = new Circle(5.0); // radius = 5
     Shape rectangle = new Rectangle(4.0, 6.0); // length = 4, width = 6

     System.out.println("Area of Circle: " + circle.area());
     System.out.println("Area of Rectangle: " + rectangle.area());
 }
}

