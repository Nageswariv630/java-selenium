package service;

import model.Student;

public class StudentService {
    private Student savedStudent;

    // Save student
    public void saveStudent(Student student) {
        this.savedStudent = student;
        System.out.println("Student saved successfully.");
    }

    // Print student details
    public void printStudent() {
        if (savedStudent != null) {
            System.out.println("Student Name: " + savedStudent.getName());
            System.out.println("Student Age: " + savedStudent.getAge());
        } else {
            System.out.println("No student saved.");
        }
    }
}

