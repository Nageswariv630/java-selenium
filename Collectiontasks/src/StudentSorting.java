
import java.util.ArrayList;
import java.util.Collections;

// Define the Student class
class Student implements Comparable<Student> {
    String name;
    int marks;

    // Constructor
    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    // Implement compareTo to sort by marks (ascending)
    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.marks, other.marks);
    }

    // For easy printing
    @Override
    public String toString() {
        return name + " - " + marks;
    }
}

// Main class
public class StudentSorting {
    public static void main(String[] args) {
        // Create a list of students
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 85));
        students.add(new Student("Bob", 72));
        students.add(new Student("Charlie", 90));
        students.add(new Student("David", 78));

        // Sort using Comparable
        Collections.sort(students);

        // Print sorted list
        System.out.println("Students sorted by marks (ascending):");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}

