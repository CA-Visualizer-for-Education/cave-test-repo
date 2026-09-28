package view;

import interface_adapter.EatCarrot.EatCarrotController;
import interface_adapter.EatCarrot.EatCarrotViewModel;

public class EatCarrotView {
    private final EatCarrotController eatCarrotController;
    private final EatCarrotViewModel eatCarrotViewModel;

    public EatCarrotView(EatCarrotController eatCarrotController,
                          EatCarrotViewModel eatCarrotViewModel) {
        this.eatCarrotController = eatCarrotController;
        this.eatCarrotViewModel = eatCarrotViewModel;
    }

    public void onEatCarrotButtonClicked(String rabbitName) {
        eatCarrotController.eatCarrot(rabbitName);
        System.out.println(eatCarrotViewModel.getMessage());
    }
}
