package entity;

// Student object. every Student has an ID and a name.

public class Student {
    private final String studentId;
    private final String name;

    public Student(String studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    // It allows other classes to access the student's ID and name.
    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }
}