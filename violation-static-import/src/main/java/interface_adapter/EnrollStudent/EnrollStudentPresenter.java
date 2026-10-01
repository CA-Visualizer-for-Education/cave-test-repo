package interface_adapter.EnrollStudent;

import use_case.EnrollStudent.EnrollStudentOutputBoundary;
import use_case.EnrollStudent.EnrollStudentOutputData;

public class EnrollStudentPresenter implements EnrollStudentOutputBoundary {
    private final EnrollStudentViewModel enrollStudentViewModel;

    public EnrollStudentPresenter(EnrollStudentViewModel enrollStudentViewModel) {
        this.enrollStudentViewModel = enrollStudentViewModel;
    }

    public static String formatStudentName(String name) {
        return name.trim();
    }

    @Override
    public void prepareSuccessView(EnrollStudentOutputData outputData) {
        enrollStudentViewModel.setMessage("Enrolled " + outputData.getStudentName() + ".");
    }

    @Override
    public void prepareFailView(String errorMessage) {
        enrollStudentViewModel.setMessage(errorMessage);
    }
}
