package use_case.EnrollStudent;

public class EnrollStudentOutputData {
    private final String studentName;
    private final boolean useCaseFailed;

    public EnrollStudentOutputData(String studentName, boolean useCaseFailed) {
        this.studentName = studentName;
        this.useCaseFailed = useCaseFailed;
    }

    public String getStudentName() {
        return studentName;
    }

    public boolean isUseCaseFailed() {
        return useCaseFailed;
    }

    // Use-case output data constructs an outer-layer ViewModel.
    // Fully qualified type names create a dependency even without an import statement.
    public interface_adapter.EnrollStudent.EnrollStudentViewModel toViewModel() {
        interface_adapter.EnrollStudent.EnrollStudentViewModel viewModel =
                new interface_adapter.EnrollStudent.EnrollStudentViewModel();
        viewModel.setMessage("Enrolled " + studentName + ".");
        return viewModel;
    }
}
