package zadanie4.entites;

import java.util.Comparator;

public class PlaneCarryCapacityComparator implements Comparator<Plane> {

    @Override
    public int compare(Plane o1, Plane o2) {
        return Integer.compare(o1.getCarryingCapacity(), o2.getCarryingCapacity());
    }
}
