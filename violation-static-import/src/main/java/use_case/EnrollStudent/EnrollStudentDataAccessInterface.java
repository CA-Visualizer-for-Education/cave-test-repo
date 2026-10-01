package use_case.EnrollStudent;

public interface EnrollStudentDataAccessInterface {
    boolean existsByStudentId(String studentId);

    String getStudentName(String studentId);

    void saveEnrolment(String studentId, String courseCode);
}
