package zadanie4.logic;

import zadanie4.entites.Plane;
import zadanie4.entites.PlaneRangeAndCarryCapacityComparator;

import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Plane> list = TxtFileReader.getPlanesFromFile(new File("src\\zadanie4\\resourсes\\Planes"));
        System.out.println();
        for (Plane plane :list) {
            System.out.println(plane);
        }
        System.out.println();
        ArrayList<Plane> list2 = new ArrayList<Plane>(list);
        list2.sort(new PlaneRangeAndCarryCapacityComparator());
        for (Plane plane :list2) {
            System.out.println(plane);
        }

    }
}
