package interface_adapter.EatCarrot;

import use_case.EatCarrot.EatCarrotOutputBoundary;
import use_case.EatCarrot.EatCarrotOutputData;

public class EatCarrotPresenter implements EatCarrotOutputBoundary {
    private final EatCarrotViewModel eatCarrotViewModel;

    public EatCarrotPresenter(EatCarrotViewModel eatCarrotViewModel) {
        this.eatCarrotViewModel = eatCarrotViewModel;
    }

    @Override
    public void prepareSuccessView(EatCarrotOutputData outputData) {
        eatCarrotViewModel.setMessage(outputData.getRabbitName() + " ate a carrot.");
    }

    @Override
    public void prepareFailView(String errorMessage) {
        eatCarrotViewModel.setMessage(errorMessage);
    }
}
