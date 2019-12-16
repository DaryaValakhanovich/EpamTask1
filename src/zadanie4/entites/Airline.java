package zadanie4.entites;

import java.util.HashSet;

public class Airline {
    private HashSet<Plane> planes;

    public Airline(HashSet<Plane> planes) {
        this.planes = planes;
    }

    public int findAllPassengers(){
        int result = 0;
        for(Plane plane : planes){
            if(plane instanceof PassengerPlane) {
                result += ((PassengerPlane) plane).getNumberOfBusinessSeats();
                result += ((PassengerPlane) plane).getNumberOfEconomySeats();
            }
        }
        return result;
    }

    public int findAllCarryingCapacity(){
        int result = 0;
        for(Plane plane : planes){
            result+=plane.getCarryingCapacity();
        }
        return result;
    }

    public Plane findPlaneWithRequiredFuelConsumption(double from, double to){
        for(Plane plane : planes){
            if(plane.getFuelConsumption() > from && plane.getFuelConsumption() < to) {
                return plane;
            }
        }
        return null;
    }
}
