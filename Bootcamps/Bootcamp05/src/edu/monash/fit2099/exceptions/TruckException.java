package edu.monash.fit2099.exceptions;

/**
 * Class for Truck Exceptions which extends Vehicle Exception
 * @author Enoch Leow
 * @version 1.0.0
 * @see VehicleException
 */
public class TruckException extends VehicleException{

    /**
     * Impliments exception for Trucks
     * @param message a String
     */
    public TruckException (String message) {
        super(message);
    }
}
