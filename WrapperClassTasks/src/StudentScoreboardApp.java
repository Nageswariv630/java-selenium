import java.util.*;

public class StudentScoreboardApp {
    public static void main(String[] args) {
        // Step 1: Create Map of student names to list of marks
        Map<String, List<Integer>> studentScores = new HashMap<>();

        // Step 2: Add students and their marks 
        studentScores.put("Nageswari", Arrays.asList(95, 90, 89));
        studentScores.put("Nasrin", Arrays.asList(92, 88, 95));
        studentScores.put("Nandini", Arrays.asList(70, 75, 80));

        // Step 3: Track highest average and student
        String topStudent = null;
        double highestAvg = 0.0;

        System.out.println("Student Scoreboard:");
        System.out.println("--------------------");

        for (Map.Entry<String, List<Integer>> entry : studentScores.entrySet()) {
            String name = entry.getKey();
            List<Integer> marks = entry.getValue();

            // Calculate average using unboxing
            int total = 0;
            for (int score : marks) { // unboxing from Integer
                total += score;
            }
            double avg = (double) total / marks.size();

            System.out.println(name + ": " + marks + " | Average: " + String.format("%.2f", avg));

            // Check for highest average using wrapper comparison
            if (avg > highestAvg) {
                highestAvg = avg;
                topStudent = name;
            }
        }

        // Step 4: Display highest scorer
        System.out.println("\nTop Scorer: " + topStudent + " with average " + String.format("%.2f", highestAvg));
    }
}

