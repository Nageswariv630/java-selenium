import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        // Create a TreeSet of integers
        Set<Integer> numbers = new TreeSet<>();

        // Add elements (unsorted)
        numbers.add(42);
        numbers.add(7);
        numbers.add(23);
        numbers.add(89);
        numbers.add(15);

        // TreeSet stores elements in sorted (ascending) order automatically
        System.out.println("Sorted TreeSet: " + numbers);
    }
}
