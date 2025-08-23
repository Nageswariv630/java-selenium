import java.util.ArrayList;
import java.util.List;

public class StudentManager {
    private List<Student> students = new ArrayList<>();

    public void addStudent(Student s) {
        students.add(s);
        System.out.println("Student added: " + s.getStudentId());
    }

    public void printAllStudents() {
        students.forEach(Student::printDetails);
    }

    public void filterStudentsByGrade(double threshold) {
        System.out.println("Students with grade >= " + threshold + ":");
        students.stream()
                .filter(s -> s.getGrade() >= threshold) // Lambda
                .forEach(Student::printDetails);
    }
}

