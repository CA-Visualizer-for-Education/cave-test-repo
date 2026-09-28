package data_access;

import entity.Rabbit;
import use_case.EatCarrot.EatCarrotDataAccessInterface;

import java.util.HashMap;
import java.util.Map;

public class InMemoryRabbitDataAccessObject implements EatCarrotDataAccessInterface {
    private final Map<String, Rabbit> rabbits = new HashMap<>();

    @Override
    public void save(String rabbitName) {
        rabbits.put(rabbitName, new Rabbit(rabbitName));
    }
}
