package reading;

import buildings.Requirements;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class RequirementsReader {
    public static List<Requirements> readRequirements() {
        List<Requirements> reqs = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("reqs.txt"))) {
            String line;
            String name = null;
            boolean first = true;
            HashMap<String, Integer> map = new HashMap<>();
            while ((line = br.readLine()) != null) {
                if (first) {
                    name = line.trim();
                    first = false;
                    continue;
                }
                if (line.trim().contains(";")) {
                    reqs.add(new Requirements(name, map));
                    first = true;
                    continue;
                }
                String[] splttedLine = line.split(" ");
                map.put(splttedLine[0].trim(), Integer.parseInt(splttedLine[1].trim()));
            }


        } catch (IOException e) {
            e.printStackTrace();
        }

        return reqs;
    }
}
