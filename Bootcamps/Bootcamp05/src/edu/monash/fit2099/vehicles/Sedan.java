package edu.monash.fit2099.vehicles;

import edu.monash.fit2099.exceptions.SedanException;
import edu.monash.fit2099.exceptions.VehicleException;

/**
 * A class which extends vehicle with added seats attribute
 * @author Enoch Leow
 * @version 1.0.0
 * @see SedanException
 * @see VehicleException
 * @see Vehicle
 */
public class Sedan extends Vehicle {
    private int seats;

    /**
     * Sedan Constructor which initialises the object
     * @param maker String of sedan maker with length between 3-15
     * @param model String of sedan model with length between 3-15
     * @param seats Integer of sedan seats with length between 4-5
     * @throws VehicleException
     */
    public Sedan(String maker, String model, int seats) throws VehicleException {
        super(maker, model);
        if (setSeats(seats)) {
            this.seats = seats;
        }
        else {
            throw new SedanException("Invalid Number of Seats");
        }
    }

    /**
     * Sedan Constructor which initialises the object
     * @param maker String of sedan maker with length between 3-15
     * @param model String of sedan model with length between 3-15
     * @param seats Integer of sedan seats with length between 4-5
     * @param vId Integer of sedan ID
     * @throws VehicleException
     */
    public Sedan(String maker, String model, int seats, int vId) throws VehicleException  {
        super(maker, model, vId);
        if (setSeats(seats)) {
            this.seats = seats;
        }
        else {
            throw new SedanException("Invalid Number of Seats");
        }
    }

    /**
     * Setter for sedan seats
     * @param seats Integer of sedan seats with length between 4-5
     * @return True/False depending on if seats are between 4-5
     */
    public boolean setSeats(int seats) {
        boolean isValid = false;
        if ((seats > 3) && (seats < 6)) {
            isValid = true;
            this.seats = seats;
        }
        return isValid;
    }
}
