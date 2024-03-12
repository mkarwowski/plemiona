package buildings;

import java.util.ArrayList;
import java.util.List;

public class RequirementsList {
    private final List<Requirements> list;

    public RequirementsList(List<Requirements> list) {
        this.list = list;
    }

    public Requirements getRequirementsForBuilding(String buildingName) {
        for (Requirements req : list) {
            if (req.getBuildingName().equals(buildingName)) {
                return req;
            }
        }
        return null;
    }
}
