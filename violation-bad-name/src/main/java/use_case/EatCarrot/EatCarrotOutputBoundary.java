package use_case.EatCarrot;

public interface EatCarrotOutputBoundary {
    void prepareSuccessView(EatCarrotOutputData outputData);

    void prepareFailView(String errorMessage);
}
