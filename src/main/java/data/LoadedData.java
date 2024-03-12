package data;

import buildings.BuildingsList;
import buildings.RequirementsList;
import reading.BuildingReader;
import reading.RequirementsReader;

public class LoadedData {
    public static BuildingsList buildingsList;
    public static RequirementsList requirementsList;

    public static void loadRequirementsAndBuildings() {
        requirementsList = new RequirementsList(RequirementsReader.readRequirements());
        buildingsList = new BuildingsList(BuildingReader.createBuildingsList());
        System.out.println("ELO");
    }
}
