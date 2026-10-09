package interface_adapter.EnrollStudent;

//import use_case.EnrollStudent.EnrollStudentOutputBoundary;
import use_case.EnrollStudent.EnrollStudentOutputData;

//public class EnrollStudentPresenter implements EnrollStudentOutputBoundary {
public class EnrollStudentPresenter{
    private final EnrollStudentViewModel enrollStudentViewModel;

    public EnrollStudentPresenter(EnrollStudentViewModel enrollStudentViewModel) {
        this.enrollStudentViewModel = enrollStudentViewModel;
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
