import java.util.ArrayList;
import java.util.Iterator;

public class IteratorRemoveExample {
    public static void main(String[] args) {
        // Create an ArrayList with sample elements
        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Andrew");
        names.add("Charlie");
        names.add("Alex");

        // Use an Iterator to traverse and remove elements starting with 'A'
        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            String name = iterator.next();
            if (name.startsWith("A")) {
                iterator.remove();  // Safe removal using iterator
            }
        }

        // Print the updated list
        System.out.println("Updated List: " + names);
    }
}

