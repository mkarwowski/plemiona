package reading;

import buildings.Building;
import buildings.Requirements;
import data.LoadedData;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BuildingReader {
    public static List<Building> createBuildingsList() {
        List<Building> buildingsList = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("points.txt"))) {
            String line;
            boolean first = true;
            boolean second = true;
            String name = null;
            ArrayList<Integer> points = new ArrayList<>();

            while ((line = br.readLine()) != null) {
                if (first) {
                    name = line.trim();
                    first = false;
                    continue;
                }
                if (second) {
                    points.add(Integer.parseInt(line.trim()));
                    second = false;
                    continue;
                }
                if (line.trim().contains(";")) {
                    first = true;
                    second = true;
                    Requirements reqs = LoadedData.requirementsList.getRequirementsForBuilding(name);
                    buildingsList.add(new Building(name, reqs, points));
                    points = new ArrayList<>();
                    continue;
                }
                points.add(points.get(points.size()-1) + Integer.parseInt(line.trim()));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return buildingsList;
    }
}
