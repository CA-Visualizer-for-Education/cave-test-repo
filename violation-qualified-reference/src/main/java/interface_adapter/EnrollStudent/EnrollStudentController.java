package interface_adapter.EnrollStudent;

import use_case.EnrollStudent.EnrollStudentInputBoundary;
import use_case.EnrollStudent.EnrollStudentInputData;

public class EnrollStudentController {
    private final EnrollStudentInputBoundary enrollStudentInteractor;

    public EnrollStudentController(EnrollStudentInputBoundary enrollStudentInteractor) {
        this.enrollStudentInteractor = enrollStudentInteractor;
    }

    public void enroll(String studentId, String courseCode) {
        EnrollStudentInputData inputData = new EnrollStudentInputData(studentId, courseCode);
        enrollStudentInteractor.execute(inputData);
    }
}
