package edu.monash.fit2099.vehicles;

import edu.monash.fit2099.exceptions.TruckException;
import edu.monash.fit2099.exceptions.VehicleException;

public class Truck extends Vehicle {
    private int capacity;
    private int wheels;

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

    public boolean setCapacity(int capacity) {
        boolean isValid = false;
        if (capacity > 0 && capacity < 16) {
            isValid = true;
            this.capacity = capacity;
        }
        return isValid;
    }

    public boolean setWheels(int wheels) {
        boolean isValid = false;
        if (wheels > 3 && wheels < 17) {
            isValid = true;
            this.wheels = wheels;

        }
        return isValid;
    }
}
