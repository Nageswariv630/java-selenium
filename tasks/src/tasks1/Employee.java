package tasks1;

public class Employee {
    // Static variable to track the number of employees
    static int count = 0;

    // Instance variables
    String name;

    // Constructor
    public Employee(String name) {
        this.name = name;
        count++; // Increase count when an employee is created
    }

    // Method to display employee name (optional)
    public void display() {
        System.out.println("Employee Name: " + name);
    }

    // Main method
    public static void main(String[] args) {
        // Create some employee objects
        Employee emp1 = new Employee("Alice");
        Employee emp2 = new Employee("Bob");
        Employee emp3 = new Employee("Charlie");

        // Optionally display each employee
        emp1.display();
        emp2.display();
        emp3.display();

        // Print total employee count
        System.out.println("\nTotal number of employees: " + Employee.count);
    }
}

