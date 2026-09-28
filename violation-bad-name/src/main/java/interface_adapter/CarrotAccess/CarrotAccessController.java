package interface_adapter.CarrotAccess;

import use_case.CarrotAccess.CarrotAccessInputBoundary;
import use_case.CarrotAccess.CarrotAccessInputData;

public class CarrotAccessController {
    private final CarrotAccessInputBoundary carrotAccessInteractor;

    public CarrotAccessController(CarrotAccessInputBoundary carrotAccessInteractor) {
        this.carrotAccessInteractor = carrotAccessInteractor;
    }

    public void checkAccess(String rabbitName) {
        CarrotAccessInputData inputData = new CarrotAccessInputData(rabbitName);
        carrotAccessInteractor.execute(inputData);
    }
}
