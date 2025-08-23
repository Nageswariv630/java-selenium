import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Student2 class with ID
class Student2 {
    String id;
    String name;
    int marks;

    public Student2(String id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return name + " (" + id + ") - " + marks;
    }
}

public class ListToMapExample {
    public static void main(String[] args) {
        // Create a list of Student2 objects
        List<Student2> studentList = new ArrayList<>();
        studentList.add(new Student2("S101", "Alice", 85));
        studentList.add(new Student2("S102", "Bob", 78));
        studentList.add(new Student2("S103", "Charlie", 92));

        // Convert to Map<String, Student2> using ID as key
        Map<String, Student2> studentMap = new HashMap<>();

        for (Student2 s : studentList) {
            studentMap.put(s.id, s);
        }

        // Print the map
        System.out.println("Student Map (ID → Student2):");
        for (Map.Entry<String, Student2> entry : studentMap.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
    }
}

