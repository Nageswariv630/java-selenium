
import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorExample {
    public static void main(String[] args) {
        // Create an ArrayList with sample elements
        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("David");

        // Create a ListIterator
        ListIterator<String> listIterator = names.listIterator();

        // Forward traversal
        System.out.println("Forward Traversal:");
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        // Backward traversal
        System.out.println("\nBackward Traversal:");
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
    }
}

