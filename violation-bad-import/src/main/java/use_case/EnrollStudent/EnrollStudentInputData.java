package use_case.EnrollStudent;

public class EnrollStudentInputData {
    private final String studentId;
    private final String courseCode;

    public EnrollStudentInputData(String studentId, String courseCode) {
        this.studentId = studentId;
        this.courseCode = courseCode;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getCourseCode() {
        return courseCode;
    }
}
