import java.util.*;

public class MarksManagementSystem {
    private static List<Student> students = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n--- Marks Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. Add Marks");
            System.out.println("3. Display All Students");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1 -> addStudent();
                case 2 -> addMarks();
                case 3 -> displayAll();
                case 4 -> {
                    System.out.println("Exiting...");
                    return;
                }
                default -> System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private static void addStudent() {
        System.out.print("Enter Student ID: ");
        String id = scanner.nextLine();
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        students.add(new Student(id, name));
        System.out.println("Student added successfully.");
    }

    private static void addMarks() {
        System.out.print("Enter Student ID: ");
        String id = scanner.nextLine();
        Student student = findStudentById(id);
        if (student == null) {
            System.out.println("Student not found!");
            return;
        }

        System.out.print("Enter Subject: ");
        String subject = scanner.nextLine();
        System.out.print("Enter Marks: ");
        int marks = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        student.addMark(subject, marks);
        System.out.println("Marks added.");
    }

    private static void displayAll() {
        if (students.isEmpty()) {
            System.out.println("No student records available.");
            return;
        }

        for (Student s : students) {
            s.displayInfo();
        }
    }

    private static Student findStudentById(String id) {
        return students.stream()
                       .filter(s -> s.getStudentId().equalsIgnoreCase(id))
                       .findFirst()
                       .orElse(null);
    }
}

