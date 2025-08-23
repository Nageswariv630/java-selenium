package tasks;
import java.util.Scanner;

public class ArrayStats {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];
        int sum = 0;
        int min, max;

        // Accepting 10 numbers from the user
        System.out.println("Enter 10 integers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
            sum += numbers[i];
        }

        // Initialize min and max with the first element
        min = max = numbers[0];

        // Finding min and max
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        // Calculating average
        double average = (double) sum / numbers.length;

        // Display results
        System.out.println("\nResults:");
        System.out.println("Average: " + average);
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);

        scanner.close();
    }
}
