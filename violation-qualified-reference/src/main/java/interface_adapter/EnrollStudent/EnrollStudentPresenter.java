package interface_adapter.EnrollStudent;

import use_case.EnrollStudent.EnrollStudentOutputBoundary;
import use_case.EnrollStudent.EnrollStudentOutputData;

public class EnrollStudentPresenter implements EnrollStudentOutputBoundary {
    private final EnrollStudentViewModel enrollStudentViewModel;

    public EnrollStudentPresenter(EnrollStudentViewModel enrollStudentViewModel) {
        this.enrollStudentViewModel = enrollStudentViewModel;
    }

    @Override
    public void prepareSuccessView(EnrollStudentOutputData outputData) {
        // Exercise the misplaced mapping and its forbidden ViewModel dependency.
        enrollStudentViewModel.setMessage(outputData.toViewModel().getMessage());
    }

    @Override
    public void prepareFailView(String errorMessage) {
        enrollStudentViewModel.setMessage(errorMessage);
    }
}
