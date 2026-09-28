package interface_adapter.login;

// Edge case: controller illegally imports inner-layer entities using a wildcard *
import entity.*;

public class LoginController {
    // In Clean Architecture, Controller is not allowed to depend directly on Entity!
    private User user;
}
