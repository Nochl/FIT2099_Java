package edu.monash.fit2099.exceptions;

/**
 * Class for Sedan Exceptions which extends Vehicle Exception
 * @author Enoch Leow
 * @version 1.0.0
 * @see VehicleException
 */
public class SedanException extends VehicleException{

    /**
     * Impliments exception for Sedan
     * @param message a String
     */
    public SedanException (String message) {
        super(message);
    }
}
