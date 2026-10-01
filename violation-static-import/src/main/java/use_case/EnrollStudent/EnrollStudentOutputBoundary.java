package use_case.EnrollStudent;

public interface EnrollStudentOutputBoundary {
    void prepareSuccessView(EnrollStudentOutputData outputData);

    void prepareFailView(String errorMessage);
}
