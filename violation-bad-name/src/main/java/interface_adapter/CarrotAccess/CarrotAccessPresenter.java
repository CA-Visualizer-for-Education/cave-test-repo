package interface_adapter.CarrotAccess;

import use_case.CarrotAccess.CarrotAccessOutputBoundary;
import use_case.CarrotAccess.CarrotAccessOutputData;

public class CarrotAccessPresenter implements CarrotAccessOutputBoundary {
    private final CarrotAccessViewModel carrotAccessViewModel;

    public CarrotAccessPresenter(CarrotAccessViewModel carrotAccessViewModel) {
        this.carrotAccessViewModel = carrotAccessViewModel;
    }

    @Override
    public void prepareSuccessView(CarrotAccessOutputData outputData) {
        carrotAccessViewModel.setHasCarrot(outputData.isHasCarrot());
        carrotAccessViewModel.setMessage(outputData.getRabbitName()
                + (outputData.isHasCarrot() ? " found a carrot." : " found no carrot."));
    }

    @Override
    public void prepareFailView(String errorMessage) {
        carrotAccessViewModel.setMessage(errorMessage);
    }
}
