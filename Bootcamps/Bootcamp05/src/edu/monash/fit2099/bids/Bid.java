package edu.monash.fit2099.bids;
import edu.monash.fit2099.buyers.Buyer;

public class Bid {
    private int bidId;
    private Buyer buyer;
    private int price;
    private String date;

    public int getBidId() {
        return bidId;
    }

    public void setBidId(int bidId) {
        this.bidId = bidId;
    }

    public Buyer getBuyer() {
        return buyer;
    }

    public void setBuyer(Buyer buyer) {
        this.buyer = buyer;
    }

    public int getPrice() {
        return price;
    }

    public boolean setPrice(int price) {
        boolean isValid=false;
        if (price >= 0) {
            isValid=true;
            this.price = price;
        }
        return isValid;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        boolean isValid=false
        String[] val = date.split("/", 3);
        day = int
        if((val[0] )

        this.date = date;
    }

    public Bid(int bidId, Buyer buyer, int price, String date) {
        this.bidId = bidId;
        this.buyer = buyer;
        this.price = price;
        this.date = date;
    }


}
