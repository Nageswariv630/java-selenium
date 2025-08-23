package tasks1;

//Functional Interface
@FunctionalInterface
interface MathOperation {
 int operate(int a, int b);
}

//Main class to test lambdas
public class LambdaTest {
 public static void main(String[] args) {
     // Lambda for addition
     MathOperation addition = (a, b) -> a + b;

     // Lambda for subtraction
     MathOperation subtraction = (a, b) -> a - b;

     // Lambda for multiplication
     MathOperation multiplication = (a, b) -> a * b;

     // Test values
     int x = 10, y = 5;

     // Call lambdas and print results
     System.out.println("Addition: " + addition.operate(x, y));         // 15
     System.out.println("Subtraction: " + subtraction.operate(x, y));   // 5
     System.out.println("Multiplication: " + multiplication.operate(x, y)); // 50
 }
}

