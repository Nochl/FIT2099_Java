import java.util.ArrayList;
import java.util.Random;

abstract public class Vehicle {

    ArrayList<Bid> bids = new ArrayList<Bid>();

    private String maker = null;
    private String model = null;
    private int vId;

    public void setMakeModel(String make, String model) {
        this.maker = make;
        this.model = model;
    }

    public void addBid(Buyer newBuyer, int price, String date) {
        bids.add(new Bid((bids.size()+1), newBuyer, price, date));
    }


    public String description() {
        return "Maker: "+ maker +" and "+model;
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
}
