package zadanie4.entites;

public class PassengerPlane extends Plane{
    private int numberOfEconomySeats;
    private int numberOfBusinessSeats;

    public PassengerPlane(double fuelConsumption, int rangeOfFlight, Engine engineType,
                          int numberOfEngines, String serialNumber, int carryingCapacity,
                          int numberOfEconomySeats, int numberOfBusinessSeats) {
        super(fuelConsumption, rangeOfFlight, engineType, numberOfEngines, serialNumber, carryingCapacity);
        this.numberOfEconomySeats = numberOfEconomySeats;
        this.numberOfBusinessSeats = numberOfBusinessSeats;
    }

    public int getNumberOfEconomySeats() {
        return numberOfEconomySeats;
    }

    public int getNumberOfBusinessSeats() {
        return numberOfBusinessSeats;
    }

    @Override
    public String toString() {
        return "PassengerPlane{" +
                " numberOfEconomySeats=" + numberOfEconomySeats +
                ", numberOfBusinessSeats=" + numberOfBusinessSeats +
                ", " + super.toString();
    }
}
