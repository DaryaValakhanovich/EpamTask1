package zadanie4.entites;

import java.util.Objects;

public abstract class Plane {
    private double fuelConsumption;
    private int rangeOfFlight;
    private Engine engineType;
    private int numberOfEngines;
    private String serialNumber;
    private int carryingCapacity;


    public Plane(double fuelConsumption, int rangeOfFlight, Engine engineType,
                 int numberOfEngines, String serialNumber, int carryingCapacity) {
        this.fuelConsumption = fuelConsumption;
        this.rangeOfFlight = rangeOfFlight;
        this.engineType = engineType;
        this.numberOfEngines = numberOfEngines;
        this.serialNumber = serialNumber;
        this.carryingCapacity = carryingCapacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Plane plane = (Plane) o;
        return Objects.equals(serialNumber, plane.serialNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serialNumber);
    }

    public int getRangeOfFlight() {
        return rangeOfFlight;
    }

    public int getCarryingCapacity() {
        return carryingCapacity;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    @Override
    public String toString() {
        return "fuelConsumption=" + fuelConsumption +
                ", rangeOfFlight=" + rangeOfFlight +
                ", engineType=" + engineType +
                ", numberOfEngines=" + numberOfEngines +
                ", serialNumber='" + serialNumber + '\'' +
                ", carryingCapacity=" + carryingCapacity + ',';
    }
}
