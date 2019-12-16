package zadanie4.logic;
import zadanie4.entites.Plane;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class TxtFileReader {

    private static List<String> readFile(File file) {
        List<String> lines = new ArrayList<String>();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
            if (lines.isEmpty()) {
                throw new NullPointerException();
            }
        } catch (NullPointerException ex) {
            System.out.println("File is empty.");
            System.exit(0);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return lines;
    }

    public static HashSet<Plane> getPlanesFromFile(File file) {
        List<String> lines = readFile(file);
        HashSet<Plane> planes = new HashSet<>();
        for (String s : lines) {
            try {
                if(PlaneValidator.checkValues(s)){
                    planes.add(PlaneFabric.createPlane(s));
                }
            } catch (IndexOutOfBoundsException ex) {
                System.out.println("Not enough parameters. " + ex.getMessage());
            } catch (IllegalArgumentException ex) {
                System.out.println("Incorrect data entry. " + ex.getMessage());
            }
        }
        return planes;
    }

}
