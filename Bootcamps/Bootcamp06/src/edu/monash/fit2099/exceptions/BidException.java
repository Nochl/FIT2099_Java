package edu.monash.fit2099.exceptions;

/**
 * Class for Bid Exceptions which extends Exception
 * @author Enoch Leow
 * @version 1.0.0
 */
public class BidException extends Exception{

    /**
     * Impliments exception for vehicles
     * @param message a String
     */
    public BidException (String message) {
        super(message);
    }
}
