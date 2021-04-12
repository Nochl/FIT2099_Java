package edu.monash.fit2099.vehicles;

public class Truck extends Vehicle {
    private int capacity;
    private int wheels;

    public Truck(String maker, String model, int capacity, int wheels) {
        super(maker, model);
        this.capacity = capacity;
        this.wheels = wheels;
    }

    public Truck(String maker, String model, int capacity, int wheels, int vId) {
        super(maker, model, vId);
        this.capacity = capacity;
        this.wheels = wheels;


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
