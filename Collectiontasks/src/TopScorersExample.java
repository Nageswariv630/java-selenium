import java.util.*;

// Student3 class
class Student3 {
    String id;
    String name;
    int marks;

    public Student3(String id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return name + " (" + marks + ")";
    }
}

public class TopScorersExample {
    public static void main(String[] args) {
        // Create a list of Student3 objects
        List<Student3> students = new ArrayList<>();
        students.add(new Student3("S101", "Alice", 85));
        students.add(new Student3("S102", "Bob", 78));
        students.add(new Student3("S103", "Charlie", 92));
        students.add(new Student3("S104", "David", 88));
        students.add(new Student3("S105", "Eva", 95));

        // Use a max-heap PriorityQueue (sort by marks descending)
        PriorityQueue<Student3> maxHeap = new PriorityQueue<>(
            (s1, s2) -> Integer.compare(s2.marks, s1.marks)
        );

        maxHeap.addAll(students);

        // Get top 3 students
        System.out.println("Top 3 Highest Scoring Students:");
        for (int i = 0; i < 3 && !maxHeap.isEmpty(); i++) {
            System.out.println(maxHeap.poll());
        }
    }
}
