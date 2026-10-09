package view;

import interface_adapter.CarrotAccess.CarrotAccessController;
import interface_adapter.CarrotAccess.CarrotAccessViewModel;

public class CarrotAccessView {
    private final CarrotAccessController carrotAccessController;
    private final CarrotAccessViewModel carrotAccessViewModel;

    public CarrotAccessView(CarrotAccessController carrotAccessController,
                             CarrotAccessViewModel carrotAccessViewModel) {
        this.carrotAccessController = carrotAccessController;
        this.carrotAccessViewModel = carrotAccessViewModel;
    }

    public void onCarrotAccessButtonClicked(String rabbitName) {
        carrotAccessController.checkAccess(rabbitName);
        System.out.println(carrotAccessViewModel.getMessage());
    }

    public boolean hasCarrot() {
        return carrotAccessViewModel.isHasCarrot();
    }
}
