package edu.monash.fit2099.vehicles;

import edu.monash.fit2099.bids.BidsManager;
import edu.monash.fit2099.exceptions.VehicleException;

import java.util.Random;

abstract public class Vehicle {

    public BidsManager bids;

    private String maker;
    private String model;
    private int vId;

    public boolean setMaker(String maker) {
        boolean isValid=false;
        if ((maker.length() > 2) && (maker.length() < 16)) {
            isValid=true;
            this.maker = maker;
        }
        return isValid;
    }

    public boolean setModel(String model) {
        boolean isValid=false;
        if ((model.length() > 2) && (model.length() < 16)) {
            isValid=true;
            this.model = model;
        }
        return isValid;
    }

    public void setMakeModel(String make, String model) {
        this.maker = make;
        this.model = model;
    }

    public String description() {
        return "Maker: "+ maker +" and Model: "+model;
    }

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

    public Vehicle(String maker, String model, int vId) throws VehicleException {
        if(setMaker(maker) && setModel(model)) {
            this.maker = maker;
            this.model = model;
            this.vId = vId;
        } else {
            throw new VehicleException("Incorrect Maker OR Model");
        }

    }

    public int getVId(){
        return vId;
    }


}
