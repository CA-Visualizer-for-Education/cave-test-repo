package use_case.CarrotAccess;

public interface CarrotAccessOutputBoundary {
    void prepareSuccessView(CarrotAccessOutputData outputData);

    void prepareFailView(String errorMessage);
}
