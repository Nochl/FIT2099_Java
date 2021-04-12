package edu.monash.fit2099.vehicles;

import edu.monash.fit2099.exceptions.TruckException;
import edu.monash.fit2099.exceptions.VehicleException;

/**
 * A class which extends vehicle with added capacity and wheels attributes
 * @author Enoch Leow
 * @version 1.0.0
 * @see TruckException
 * @see VehicleException
 * @see Vehicle
 */
public class Truck extends Vehicle {
    /**
     * Capacity of truck
     */
    private int capacity;
    /**
     * Capacity of wheels
     */
    private int wheels;

    /**
     * Truck Constructor which throws exceptions for invalid values
     * @param maker String of truck maker with length between 3-15
     * @param model String of truck model with length between 3-15
     * @param capacity Int of truck capacity between 1-15
     * @param wheels Int of truck wheels between 4-16
     * @throws VehicleException if maker or model is out of valid range
     */
    public Truck(String maker, String model, int capacity, int wheels) throws VehicleException {
        super(maker, model);
        if (setCapacity(capacity) && setWheels(wheels)) {
            this.capacity = capacity;
            this.wheels = wheels;
        }
        else {
            throw new TruckException("Incorrect Capacity OR No. of Wheels");
        }
    }

    /**
     * Truck Constructor which throws exceptions for invalid values
     * @param maker String of truck maker with length between 3-15
     * @param model String of truck model with length between 3-15
     * @param capacity Int of truck capacity between 1-15
     * @param wheels Int of truck wheels between 4-16
     * @param vId Integer of truck ID
     * @throws VehicleException if maker or model is out of valid range
     */
    public Truck(String maker, String model, int capacity, int wheels, int vId) throws VehicleException{
        super(maker, model, vId);
        if (setCapacity(capacity) && setWheels(wheels)) {
            this.capacity = capacity;
            this.wheels = wheels;
        }
        else {
            throw new TruckException("Incorrect Capacity OR No. of Wheels");
        }

    }

    /**
     * Set Truck capacity
     * @param capacity Int of truck capacity between 1-15
     * @return True/False depending if capacity is between 1-15
     */
    public boolean setCapacity(int capacity) {
        boolean isValid = false;
        if (capacity > 0 && capacity < 16) {
            isValid = true;
            this.capacity = capacity;
        }
        return isValid;
    }

    /**
     * Set Truck wheels
     * @param wheels Int of wheels capacity between 4-16
     * @return True/False depending if wheels is between 4-16
     */
    public boolean setWheels(int wheels) {
        boolean isValid = false;
        if (wheels > 3 && wheels < 17) {
            isValid = true;
            this.wheels = wheels;

        }
        return isValid;
    }
}
