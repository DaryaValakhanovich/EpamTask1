package zadanie4.entites;

public class CargoAirplane extends Plane{
    private double hatchWidth;
    private double hatchHeight;

    public CargoAirplane(double fuelConsumption, int rangeOfFlight, Engine engineType,
                         int numberOfEngines, String serialNumber, int carryingCapacity,
                         double hatchWidth, double hatchHeight) {
        super(fuelConsumption, rangeOfFlight, engineType, numberOfEngines, serialNumber, carryingCapacity);
        this.hatchWidth = hatchWidth;
        this.hatchHeight = hatchHeight;
    }

    @Override
    public String toString() {
        return "CargoAirplane{" +
                "hatchWidth=" + hatchWidth +
                ", hatchHeight=" + hatchHeight +
                ", " + super.toString();
    }
}
