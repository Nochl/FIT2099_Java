import java.util.ArrayList;

public class Car {

    ArrayList<Bid> bids = new ArrayList<Bid>();

    private String make = null;
    private String model = null;

    public void setMakeModel(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public void addBid(Buyer newBuyer, int price, String date) {
        bids.add(new Bid((bids.size()+1), newBuyer, price, date));
    }


    public String description() {
        return "Maker: "+make+" and "+model;
    }


}
