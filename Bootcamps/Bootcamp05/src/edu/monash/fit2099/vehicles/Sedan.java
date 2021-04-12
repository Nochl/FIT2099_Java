package edu.monash.fit2099.vehicles;

import edu.monash.fit2099.exceptions.SedanException;
import edu.monash.fit2099.exceptions.VehicleException;

public class Sedan extends Vehicle {
    private int seats;

    public Sedan(String maker, String model, int seats) throws VehicleException {
        super(maker, model);
        if (setSeats(seats)) {
            this.seats = seats;
        }
        else {
            throw new SedanException("Invalid Number of Seats");
        }
    }

    public Sedan(String maker, String model, int seats, int vId) throws VehicleException  {
        super(maker, model, vId);
        if (setSeats(seats)) {
            this.seats = seats;
        }
        else {
            throw new SedanException("Invalid Number of Seats");
        }
    }

    public boolean setSeats(int seats) {
        boolean isValid = false;
        if ((seats > 3) && (seats < 6)) {
            isValid = true;
            this.seats = seats;
        }
        return isValid;
    }
}
