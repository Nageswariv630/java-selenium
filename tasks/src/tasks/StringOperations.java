package tasks;
import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input string from user
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Length of the string
        System.out.println("Length: " + str.length());

        // Convert to uppercase and lowercase
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());

        // Substring 
        if (str.length() >= 5) {
            System.out.println("Substring (0 to 5): " + str.substring(0, 5));
        } else {
            System.out.println("Substring (entire string): " + str);
        }

        // Index of a character 
        System.out.print("Enter a character to find index: ");
        char ch = sc.next().charAt(0);
        int index = str.indexOf(ch);

        if (index != -1) {
            System.out.println("Index of '" + ch + "': " + index);
        } else {
            System.out.println("Character '" + ch + "' not found in the string.");
        }

        sc.close();
    }
}

