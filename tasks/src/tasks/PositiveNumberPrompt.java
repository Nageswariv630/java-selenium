package tasks;
import java.util.Scanner;

public class PositiveNumberPrompt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        do {
            System.out.print("Enter a positive number (enter 1 to stop): ");
            number = scanner.nextInt();

            if (number <= 0) {
                System.out.println("Only positive numbers are allowed!");
            }

        } while (number != 1);

        System.out.println("You entered 1. Program ended.");
        scanner.close();
    }
}

