package edu.monash.fit2099.bids;
import edu.monash.fit2099.buyers.Buyer;

public class Bid {
    private int bidId;
    private int buyerid;
    private int price;
    private String date;

    public int getBidId() {
        return bidId;
    }

    public void setBidId(int bidId) {
        this.bidId = bidId;
    }

    public int getBuyer() {
        return buyerid;
    }

    public void setBuyer(int buyerid) {
        this.buyerid = buyerid;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Bid(int bidId, int buyerid, int price, String date) {
        this.bidId = bidId;
        this.buyerid = buyerid;
        this.price = price;
        this.date = date;
    }


}
