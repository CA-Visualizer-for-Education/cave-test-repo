package interface_adapter.CarrotAccess;

public class CarrotAccessViewModel {
    private String message = "";
    private boolean hasCarrot = false;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isHasCarrot() {
        return hasCarrot;
    }

    public void setHasCarrot(boolean hasCarrot) {
        this.hasCarrot = hasCarrot;
    }
}
