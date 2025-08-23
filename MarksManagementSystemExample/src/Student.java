import java.util.*;

public class Student {
    private String studentId;
    private String name;
    private Map<String, Integer> marks;

    public Student(String studentId, String name) {
        this.studentId = studentId;
        this.name = name;
        this.marks = new HashMap<>();
    }

    public void addMark(String subject, int score) {
        marks.put(subject, score);
    }

    public int getTotalMarks() {
        return marks.values().stream().mapToInt(Integer::intValue).sum();
    }

    public double getAverageMarks() {
        return marks.isEmpty() ? 0 : getTotalMarks() / (double) marks.size();
    }

    public void displayInfo() {
        System.out.println("ID: " + studentId + ", Name: " + name);
        System.out.println("Marks:");
        for (Map.Entry<String, Integer> entry : marks.entrySet()) {
            System.out.println("  " + entry.getKey() + ": " + entry.getValue());
        }
        System.out.println("Total: " + getTotalMarks());
        System.out.println("Average: " + String.format("%.2f", getAverageMarks()));
        System.out.println();
    }

    public String getStudentId() {
        return studentId;
    }
}

