import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // Create an ArrayList of Strings
        ArrayList<String> languages = new ArrayList<>();

        // Add 5 elements
        languages.add("Java");
        languages.add("C");
        languages.add("C++");
        languages.add("Ruby");
        languages.add("Python");

        // Remove the 2nd element (index 1)
        languages.remove(1);

        // Print all elements
        System.out.println(languages);
    }
}

