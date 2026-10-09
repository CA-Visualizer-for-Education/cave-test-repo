package use_case.CarrotAccess;

public class CarrotAccessInputData {
    private final String rabbitName;

    public CarrotAccessInputData(String rabbitName) {
        this.rabbitName = rabbitName;
    }

    public String getRabbitName() {
        return rabbitName;
    }
}
