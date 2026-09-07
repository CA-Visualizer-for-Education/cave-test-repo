package entity;

import interface_adapter.EnrollStudent.EnrollStudentController;

// Deliberately broken: the entity holds a controller and calls back out to it.
public class Student {
    private final String studentId;
    private final String name;
    private EnrollStudentController enrollStudentController;

    public Student(String studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public void setEnrollStudentController(EnrollStudentController enrollStudentController) {
        this.enrollStudentController = enrollStudentController;
    }

    public void reEnroll(String courseCode) {
        enrollStudentController.enroll(studentId, courseCode);
    }
}
