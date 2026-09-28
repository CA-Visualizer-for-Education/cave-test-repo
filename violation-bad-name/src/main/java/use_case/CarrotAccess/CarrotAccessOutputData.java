package use_case.CarrotAccess;

public class CarrotAccessOutputData {
    private final String rabbitName;
    private final boolean hasCarrot;

    public CarrotAccessOutputData(String rabbitName, boolean hasCarrot) {
        this.rabbitName = rabbitName;
        this.hasCarrot = hasCarrot;
    }

    public String getRabbitName() {
        return rabbitName;
    }

    public boolean isHasCarrot() {
        return hasCarrot;
    }
}
