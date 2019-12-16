package zadanie4.entites;

import java.util.Comparator;

public class PlaneRangeAndCarryCapacityComparator implements Comparator<Plane> {

    @Override
    public int compare(Plane o1, Plane o2) {
        if(o1.getRangeOfFlight()==o2.getRangeOfFlight()){
            return new PlaneCarryCapacityComparator().compare(o1, o2);
        }
        return Integer.compare(o1.getRangeOfFlight(), o2.getRangeOfFlight());
    }
}
