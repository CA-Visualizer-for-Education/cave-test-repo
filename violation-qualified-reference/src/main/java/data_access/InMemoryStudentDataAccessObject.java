package data_access;

import entity.Student;
import use_case.EnrollStudent.EnrollStudentDataAccessInterface;

import java.util.HashMap;
import java.util.Map;

public class InMemoryStudentDataAccessObject implements EnrollStudentDataAccessInterface {
    private final Map<String, Student> students = new HashMap<>();
    private final Map<String, String> enrolments = new HashMap<>();

    @Override
    public boolean existsByStudentId(String studentId) {
        return students.containsKey(studentId);
    }

    @Override
    public String getStudentName(String studentId) {
        return students.get(studentId).getName();
    }

    @Override
    public void saveEnrolment(String studentId, String courseCode) {
        enrolments.put(studentId, courseCode);
    }
}
