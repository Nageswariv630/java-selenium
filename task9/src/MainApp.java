import model.Student;
import service.StudentService;

public class MainApp {
    public static void main(String[] args) {
        // Create a student
        Student student = new Student("Alice", 20);

        // Create the service
        StudentService service = new StudentService();

        // Save and print student
        service.saveStudent(student);
        service.printStudent();
    }
}

