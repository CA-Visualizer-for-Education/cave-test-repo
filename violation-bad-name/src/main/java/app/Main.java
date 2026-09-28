package app;

import data_access.InMemoryRabbitDataAccessObject;
import interface_adapter.CarrotAccess.CarrotAccessController;
import interface_adapter.CarrotAccess.CarrotAccessPresenter;
import interface_adapter.CarrotAccess.CarrotAccessViewModel;
import interface_adapter.EatCarrot.EatCarrotController;
import interface_adapter.EatCarrot.EatCarrotPresenter;
import interface_adapter.EatCarrot.EatCarrotViewModel;
import use_case.CarrotAccess.CarrotAccessInputBoundary;
import use_case.CarrotAccess.CarrotAccessInteractor;
import use_case.EatCarrot.EatCarrotInputBoundary;
import use_case.EatCarrot.EatCarrotInteractor;
import view.CarrotAccessView;
import view.EatCarrotView;

public class Main {
    public static void main(String[] args) {
        CarrotAccessViewModel carrotAccessViewModel = new CarrotAccessViewModel();
        CarrotAccessPresenter carrotAccessPresenter = new CarrotAccessPresenter(carrotAccessViewModel);
        CarrotAccessInputBoundary carrotAccessInteractor =
                new CarrotAccessInteractor(carrotAccessPresenter);
        CarrotAccessController carrotAccessController = new CarrotAccessController(carrotAccessInteractor);

        CarrotAccessView carrotAccessView = new CarrotAccessView(carrotAccessController, carrotAccessViewModel);
        carrotAccessView.onCarrotAccessButtonClicked("Bunny");

        if (carrotAccessView.hasCarrot()) {
            InMemoryRabbitDataAccessObject rabbitDataAccessObject = new InMemoryRabbitDataAccessObject();
            EatCarrotViewModel viewModel = new EatCarrotViewModel();
            EatCarrotPresenter presenter = new EatCarrotPresenter(viewModel);
            EatCarrotInputBoundary interactor =
                    new EatCarrotInteractor(rabbitDataAccessObject, presenter);
            EatCarrotController controller = new EatCarrotController(interactor);

            EatCarrotView view = new EatCarrotView(controller, viewModel);
            view.onEatCarrotButtonClicked("Bunny");
        }
    }
}
