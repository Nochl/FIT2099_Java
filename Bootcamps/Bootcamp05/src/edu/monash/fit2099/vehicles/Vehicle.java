package edu.monash.fit2099.vehicles;

import edu.monash.fit2099.bids.BidsManager;

import java.util.Random;

abstract public class Vehicle {

    public BidsManager bids = new BidsManager();

    private String maker = null;
    private String model = null;
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

    /*
    public void addBid(Buyer newBuyer, int price, String date) {
        bids.addbid(new Bid((bids.size()+1), newBuyer, price, date));
    }

     */

    public String description() {
        return "Maker: "+ maker +" and Model: "+model;
    }

    public Vehicle(String maker, String model) {
        this.maker = maker;
        this.model = model;
        Random r = new Random();
        int low = 10000;
        int high = 99999;
        this.vId = (r.nextInt(high - low) + low);
    }

    public Vehicle(String maker, String model, int vId) {
        this.maker = maker;
        this.model = model;
        this.vId = vId;

    }

    public int getVId(){
        return vId;
    }


}
