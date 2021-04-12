package edu.monash.fit2099.vehicles;

public class Sedan extends Vehicle {
    private int seats;

    public Sedan(String maker, String model, int seats) {
        super(maker, model);
        this.seats = seats;
        boolean isValid = false;
    }

    public Sedan(String maker, String model, int seats, int vId) {
        super(maker, model, vId);
        this.seats = seats;

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
