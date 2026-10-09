package use_case.CarrotAccess;

public class CarrotAccessInteractor implements CarrotAccessInputBoundary {
    private final CarrotAccessOutputBoundary carrotPresenter;

    public CarrotAccessInteractor(CarrotAccessOutputBoundary carrotPresenter) {
        this.carrotPresenter = carrotPresenter;
    }

    @Override
    public void execute(CarrotAccessInputData inputData) {
        boolean hasCarrot = true;
        carrotPresenter.prepareSuccessView(
                new CarrotAccessOutputData(inputData.getRabbitName(), hasCarrot));
    }
}
