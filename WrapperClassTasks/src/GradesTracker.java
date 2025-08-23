import java.util.*;

public class GradesTracker {
    public static void main(String[] args) {
        // Step 1: Create ArrayList<Integer>
        ArrayList<Integer> marks = new ArrayList<>();

        // Step 2: Add 5 student marks (autoboxing from int to Integer)
        marks.add(72);
        marks.add(88);
        marks.add(65);
        marks.add(90);
        marks.add(78);

        System.out.println("Original Marks: " + marks);

        // Step 3: Remove the lowest mark
        Integer minMark = Collections.min(marks);
        marks.remove(minMark); // removes first occurrence of the min value
        System.out.println("After Removing Lowest (" + minMark + "): " + marks);

        // Step 4: Calculate max, min, and average
        int max = Collections.max(marks);
        int min = Collections.min(marks);
        double average = 0.0;

        int sum = 0;
        for (int mark : marks) { // unboxing from Integer to int
            sum += mark;
        }
        average = (double) sum / marks.size();

        // Step 5: Display results
        System.out.println("Highest Mark: " + max);
        System.out.println("Lowest Mark: " + min);
        System.out.println("Average Mark: " + String.format("%.2f", average));
    }
}
