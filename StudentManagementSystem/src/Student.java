public class Student extends Person implements Printable {
    private String studentId;
    private double grade;

    public Student(String name, int age, String studentId, double grade) {
        super(name, age);
        this.studentId = studentId;
        this.grade = grade;
    }

    public double getGrade() {
        return grade;
    }

    public String getStudentId() {
        return studentId;
    }

    @Override
    public void printDetails() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
        System.out.println("-----------------------");
    }
}

