package main.java.entity;

//Student is inner most layer. an entity.
import main.java.features.Enrollment.EnrollStudent.interface_adapter.EnrollStudentController;
public class Student {
    private final String studentId;
    private final String name;
    //Inner layers can't depend on outer.
    //This is bad because the Student (inner layer) referneces the controller (outer layer)
    private EnrollStudentController controller;

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

    //Student calling method on controller
    //Bad because what a student is depends on how the controller works
    //Now if controller changes, student might break too.
    public void notifyController() {
        controller.someMethod();
    }
}