package tasks1;
//Calculator class with method overloading
class Calculator {

 // Adds two integers
 int add(int a, int b) {
     return a + b;
 }

 // Adds two doubles
 double add(double a, double b) {
     return a + b;
 }

 // Concatenates two strings
 String add(String a, String b) {
     return a + b;
 }
}

//Main class to test the overloaded methods
public class CalculatorTest {
 public static void main(String[] args) {
     Calculator calc = new Calculator();

     // Testing different add() methods
     int sumInt = calc.add(5, 10);
     double sumDouble = calc.add(3.5, 2.7);
     String sumString = calc.add("Hello, ", "World!");

     // Printing results
     System.out.println("Integer Sum: " + sumInt);
     System.out.println("Double Sum: " + sumDouble);
     System.out.println("String Concatenation: " + sumString);
 }
}

