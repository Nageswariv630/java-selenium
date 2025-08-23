
import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        // Create a HashSet of Strings
        Set<String> programmingLanguages = new HashSet<>();

        // Add elements, including duplicates
        programmingLanguages.add("Java");
        programmingLanguages.add("Python");
        programmingLanguages.add("C++");
        programmingLanguages.add("Java");     // Duplicate
        programmingLanguages.add("Python");   // Duplicate

        // Print the HashSet
        System.out.println("HashSet contents: " + programmingLanguages);
    }
}

