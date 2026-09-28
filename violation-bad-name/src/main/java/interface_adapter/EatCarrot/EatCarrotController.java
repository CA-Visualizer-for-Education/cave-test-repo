package interface_adapter.EatCarrot;

import use_case.EatCarrot.EatCarrotInputBoundary;
import use_case.EatCarrot.EatCarrotInputData;

public class EatCarrotController {
    private final EatCarrotInputBoundary eatCarrotInteractor;

    public EatCarrotController(EatCarrotInputBoundary eatCarrotInteractor) {
        this.eatCarrotInteractor = eatCarrotInteractor;
    }

    public void eatCarrot(String rabbitName) {
        EatCarrotInputData inputData = new EatCarrotInputData(rabbitName);
        eatCarrotInteractor.execute(inputData);
    }
}
