import data.LoadedData;
import reading.BuildingReader;

public class Main {

    public static void main(String[] args) {
        try {
            int points = Integer.parseInt(args[0]);
            System.out.println("Looking for solution for " + points + " points");

            LoadedData.loadRequirementsAndBuildings();
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("You have to pass points as the argument of the program!");
        }
    }
}
