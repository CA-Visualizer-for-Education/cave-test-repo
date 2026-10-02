package data_access;

import entity.Student;

import java.util.HashMap;
import java.util.Map;

/*(DAI) Under Clean Architecture, this should implement a data acess interface;
however, it has been removed in this bad example. If we wanted to use this data
access object, what would we have to do now?*/

public class InMemoryStudentDataAccessObject {
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
