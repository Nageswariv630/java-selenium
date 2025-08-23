import java.util.Arrays;

public class WrapperSortingExample {
    public static void main(String[] args) {
        // Step 1: Create an array of Integer objects (autoboxing from int)
        Integer[] scores = {85, 92, 78, 96, 88};

        // Step 2: Sort using Arrays.sort()
        Arrays.sort(scores); // Ascending order

        // Step 3: Print sorted array
        System.out.println("Sorted Scores: " + Arrays.toString(scores));

        // Step 4: Find the 2nd highest value
        // Sorted ascending → 2nd highest = second last element
        int secondHighest = scores[scores.length - 2];
        System.out.println("2nd Highest Score: " + secondHighest);
    }
}

