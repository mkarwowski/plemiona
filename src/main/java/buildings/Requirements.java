package buildings;

import java.util.HashMap;

public class Requirements {
    private final String buildingName;
    private final HashMap<String, Integer> requirements;

    public Requirements(String name) {
        this.buildingName = name;
        this.requirements = new HashMap<>();
    }

    public Requirements(String name, HashMap<String, Integer> requirements) {
        this.buildingName = name;
        this.requirements = new HashMap<>(requirements);
    }

    public void addRequirement(String name, int level) {
        requirements.put(name, level);
    }

    public String getBuildingName() {
        return buildingName;
    }
}
