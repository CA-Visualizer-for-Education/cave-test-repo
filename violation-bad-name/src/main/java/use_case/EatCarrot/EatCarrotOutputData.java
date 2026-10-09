package use_case.EatCarrot;

public class EatCarrotOutputData {
    private final String rabbitName;

    public EatCarrotOutputData(String rabbitName) {
        this.rabbitName = rabbitName;
    }

    public String getRabbitName() {
        return rabbitName;
    }
}
