import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Employee class
class Employee {
    String name;
    String department;

    // Constructor
    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    // For printing
    @Override
    public String toString() {
        return name;
    }
}

public class GroupByDepartment {
    public static void main(String[] args) {
        // Sample employee list
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alice", "HR"));
        employees.add(new Employee("Bob", "IT"));
        employees.add(new Employee("Charlie", "HR"));
        employees.add(new Employee("David", "Finance"));
        employees.add(new Employee("Eva", "IT"));

        // Group by department
        Map<String, List<Employee>> groupedByDept = new HashMap<>();

        for (Employee emp : employees) {
            // If department not in map, add it
            groupedByDept.putIfAbsent(emp.department, new ArrayList<>());

            // Add employee to the department list
            groupedByDept.get(emp.department).add(emp);
        }

        // Print grouped employees
        for (Map.Entry<String, List<Employee>> entry : groupedByDept.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

