package view;

import interface_adapter.EnrollStudent.EnrollStudentController;
import interface_adapter.EnrollStudent.EnrollStudentViewModel;

public class EnrollStudentView {
    private final EnrollStudentController enrollStudentController;
    private final EnrollStudentViewModel enrollStudentViewModel;

    public EnrollStudentView(EnrollStudentController enrollStudentController,
                             EnrollStudentViewModel enrollStudentViewModel) {
        this.enrollStudentController = enrollStudentController;
        this.enrollStudentViewModel = enrollStudentViewModel;
    }

    public void onEnrolButtonClicked(String studentId, String courseCode) {
        enrollStudentController.enroll(studentId, courseCode);
        System.out.println(enrollStudentViewModel.getMessage());
    }
}
