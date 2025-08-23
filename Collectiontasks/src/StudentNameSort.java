import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// Student class without implementing Comparable
class Student1 {
    String name;
    int marks;

    // Constructor
    public Student1(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    // For printing
    @Override
    public String toString() {
        return name + " - " + marks;
    }
}

public class StudentNameSort {
    public static void main(String[] args) {
        // Create a list of students
        ArrayList<Student1> students = new ArrayList<>();
        students.add(new Student1("Charlie", 90));
        students.add(new Student1("Alice", 85));
        students.add(new Student1("David", 78));
        students.add(new Student1("Bob", 72));

        // Sort using Comparator (by name)
        Collections.sort(students, new Comparator<Student1>() {
            @Override
            public int compare(Student1 s1, Student1 s2) {
                return s1.name.compareTo(s2.name);
            }
        });

        // Print sorted list
        System.out.println("Students sorted by name (A-Z):");
        for (Student1 s : students) {
            System.out.println(s);
        }
    }
}
