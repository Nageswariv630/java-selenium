public class MainApp {
    public static void main(String[] args) {
        // Login as admin
        AdminUser admin = new AdminUser();
        admin.login("admin1", "password");

        // Create student manager
        StudentManager manager = new StudentManager();

        // Add students
        manager.addStudent(new Student("Alice", 20, "S001", 85.5));
        manager.addStudent(new Student("Bob", 22, "S002", 72.0));
        manager.addStudent(new Student("Charlie", 19, "S003", 91.3));

        System.out.println("\nAll Students:");
        manager.printAllStudents();

        System.out.println("\nFiltered Students (Grade >= 80):");
        manager.filterStudentsByGrade(80);
    }
}

