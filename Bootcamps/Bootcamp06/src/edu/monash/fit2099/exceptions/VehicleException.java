package edu.monash.fit2099.exceptions;

/**
 * Class for Vehicle Exceptions which extends Exception
 * @author Enoch Leow
 * @version 1.0.0
 */
public class VehicleException extends Exception{

    /**
     * Impliments exception for vehicles
     * @param message a String
     */
    public VehicleException(String message) {
        super(message);
    }
}
