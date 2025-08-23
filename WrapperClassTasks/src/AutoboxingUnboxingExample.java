import java.util.*;

public class AutoboxingUnboxingExample {
    public static void main(String[] args) {
        // Step 1: Declare List<Double> and add primitive double values (Autoboxing occurs here)
        List<Double> marks = new ArrayList<>();
        marks.add(85.5);
        marks.add(90.0);
        marks.add(78.25);
        marks.add(92.75);
        marks.add(88.0);

        // Step 2: Retrieve values, calculate sum (Unboxing occurs automatically)
        double sum = 0.0;
        for (double mark : marks) {
            sum += mark; // mark is unboxed from Double to double
        }

        // Step 3: Calculate and display average
        double average = sum / marks.size();

        // Step 4: Display results
        System.out.println("Marks: " + marks);
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + String.format("%.2f", average));
    }
}

