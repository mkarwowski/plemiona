package buildings;

import java.util.List;

public class Building {
    private final String name;
    private final Requirements requirements;
    private final List<Integer> points;


    public Building(String name, Requirements requirements, List<Integer> points) {
        this.name = name;
        this.requirements = requirements;
        this.points = points;
    }
}
