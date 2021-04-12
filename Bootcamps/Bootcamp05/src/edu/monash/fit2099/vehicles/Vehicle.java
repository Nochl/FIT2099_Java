package edu.monash.fit2099.vehicles;

import edu.monash.fit2099.bids.BidsManager;
import edu.monash.fit2099.exceptions.VehicleException;

import java.util.Random;

/**
 * Stores vehicles main information and its bids in an instance of the BidManager class
 * @author Enoch Leow
 * @version 1.0.0
 * @see BidsManager
 * @see VehicleException
 */
abstract public class Vehicle {
    /**
     * Instance of BidsManager which stores the cars bids objects
     */
    public BidsManager bids;
    /**
     * Name of vehicle Maker
     */
    private String maker;
    /**
     * Name of vehicle Model
     */
    private String model;
    /**
     * Vehicles idenficaiton number
     */
    private int vId;

    /**
     * @param maker a String of Manufacturers Name of length between 3-15
     * @return True/False depending if make is between 3-15
     */
    public boolean setMaker(String maker) {
        boolean isValid=false;
        if ((maker.length() > 2) && (maker.length() < 16)) {
            isValid=true;
            this.maker = maker;
        }
        return isValid;
    }

    /**
     * @param model String of the cars Model of length between 3-15
     * @return True/False depending if model is between 3-15
     */
    public boolean setModel(String model) {
        boolean isValid=false;
        if ((model.length() > 2) && (model.length() < 16)) {
            isValid=true;
            this.model = model;
        }
        return isValid;
    }


    /**
     * @return make and model for vehicle
     */
    public String description() {
        return "Maker: "+ maker +" and Model: "+model;
    }

    /**
     * Vehicle Constructor which throws exceptions for invalid values
     * @param maker String of car Maker with length between 3-15
     * @param model String of car model with length between 3-15
     * @throws VehicleException if Maker or Model is outside of valid ranges
     */
    public Vehicle(String maker, String model) throws VehicleException {
        if(setMaker(maker) && setModel(model)) {
            bids = new BidsManager();
            this.maker = maker;
            this.model = model;
            Random r = new Random();
            int low = 10000;
            int high = 99999;
            this.vId = (r.nextInt(high - low) + low);
        } else {
            throw new VehicleException("Incorrect Maker OR Model");
        }

    }

    /**
     * Vehicle Constructor which throws exceptions for invalid values
     * @param maker a String of the Manufacturers Name of length between 3-15
     * @param model a String of the cars Model of length between 3-15
     * @param vId integer vehicle ID
     * @throws VehicleException if Maker or Model is outside of valid ranges
     */
    public Vehicle(String maker, String model, int vId) throws VehicleException {
        if(setMaker(maker) && setModel(model)) {
            this.maker = maker;
            this.model = model;
            this.vId = vId;
        } else {
            throw new VehicleException("Incorrect Maker OR Model");
        }

    }

    /**
     * @return Integer of vehicle ID
     */
    public int getVId(){
        return vId;
    }


}
