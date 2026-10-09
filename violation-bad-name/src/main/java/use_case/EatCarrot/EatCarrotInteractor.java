package use_case.EatCarrot;

import entity.Rabbit;

public class EatCarrotInteractor implements EatCarrotInputBoundary {
    private final EatCarrotDataAccessInterface rabbitDataAccessObject;
    private final EatCarrotOutputBoundary rabbitPresenter;

    public EatCarrotInteractor(EatCarrotDataAccessInterface rabbitDataAccessObject,
                               EatCarrotOutputBoundary rabbitPresenter) {
        this.rabbitDataAccessObject = rabbitDataAccessObject;
        this.rabbitPresenter = rabbitPresenter;
    }

    @Override
    public void execute(EatCarrotInputData inputData) {
        Rabbit rabbit = new Rabbit(inputData.getRabbitName());
        rabbitDataAccessObject.save(rabbit.getName());
        rabbitPresenter.prepareSuccessView(new EatCarrotOutputData(rabbit.getName()));
    }
}
