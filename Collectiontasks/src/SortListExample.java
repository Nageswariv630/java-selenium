import java.util.ArrayList;
import java.util.Collections;

public class SortListExample {
    public static void main(String[] args) {
        // Create a list of integers
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(42);
        numbers.add(15);
        numbers.add(73);
        numbers.add(8);
        numbers.add(31);

        // Sort in ascending order
        Collections.sort(numbers);
        System.out.println("Ascending Order: " + numbers);

        // Sort in descending order
        Collections.sort(numbers, Collections.reverseOrder());
        System.out.println("Descending Order: " + numbers);
    }
}

