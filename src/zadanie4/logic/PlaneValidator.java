package zadanie4.logic;

import zadanie4.entites.Engine;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PlaneValidator {
    public static boolean checkValues(String line)
            throws IndexOutOfBoundsException,IllegalArgumentException{
        StringTokenizer stt = new StringTokenizer(line, " ");
        List<String> eachLine = new ArrayList<String>();
        while (stt.hasMoreTokens()) {
            eachLine.add(stt.nextToken());
        }
        if
        (
                isCorrectFuelConsumption(Double.parseDouble(eachLine.get(1)))
                && isCorrectRangeOfFlight(Integer.parseInt(eachLine.get(2)))
                && isCorrectEngineType(eachLine.get(3))
                && isCorrectNumberOfEngines(Integer.parseInt(eachLine.get(4)))
                && isCorrectSerialNumber(eachLine.get(5))
                && isCorrectCarryingCapacity(Integer.parseInt(eachLine.get(6))))
        {
            switch (eachLine.get(0)) {
                case "Pas":
                    return isCorrectNumberOfBusinessSeats(Integer.parseInt(eachLine.get(7)))
                            && isCorrectNumberOfEconomySeats(Integer.parseInt(eachLine.get(8)));
                case "Car":
                    return isCorrectHatchWidth(Double.parseDouble(eachLine.get(7)))
                            && isCorrectHatchHeight(Double.parseDouble(eachLine.get(8)));
            }
        }
        return false;
    }

    private static boolean isCorrectFuelConsumption(double fuelConsumption){
        return fuelConsumption > 0;
    }
    private static boolean isCorrectRangeOfFlight(int rangeOfFlight){
        return rangeOfFlight > 1000;
    }
    private static boolean isCorrectNumberOfEngines(int numberOfEngines){
        return numberOfEngines > 0 && numberOfEngines < 10;
    }
    private static boolean isCorrectEngineType(String engineType){
        Engine.valueOf(engineType);
        return true;
    }
    private static boolean isCorrectSerialNumber(String serialNumber){
        Pattern pattern = Pattern.compile("EW-\\d{3}.{2}");
        Matcher matcher = pattern.matcher(serialNumber);
        return matcher.matches();
    }
    private static boolean isCorrectCarryingCapacity(int carryingCapacity){
        return carryingCapacity > 1000;
    }
    private static boolean isCorrectNumberOfEconomySeats(int numberOfEconomySeats){
        return numberOfEconomySeats > 0;
    }
    private static boolean isCorrectNumberOfBusinessSeats(int numberOfBusinessSeats){
        return numberOfBusinessSeats > -1;
    }
    private static boolean isCorrectHatchWidth(double hatchWidth){
        return hatchWidth > 0;
    }
    private static boolean isCorrectHatchHeight(double hatchHeight){
        return hatchHeight > 0;
    }
}
