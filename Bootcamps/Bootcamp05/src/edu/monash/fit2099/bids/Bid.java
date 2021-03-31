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

    public boolean setPrice(int price) {
        boolean isValid=false;
        if(price >=0) {
            isValid = true
            this.price = price;
        }
        return isValid;
    }

    public String getDate() {
        return date;
    }

    public boolean setDate(String date) {
        boolean isValid=false;
        String[] splits = date.split("/", 3);
        int day = Integer.parseInt(splits[0]);
        int month = Integer.parseInt(splits[1]);
        int year = Integer.parseInt(splits[2]);
        if ((day<32) && (day>0) && (month<13) && (month>0) && (year>1929) && (year<2022)) {
            this.date = date;
            isValid=true;
        }
        return isValid;
    }


    public Bid(int bidId, int buyerid, int price, String date) {
        this.bidId = bidId;
        this.buyerid = buyerid;
        this.price = price;
        this.date = date;
    }


}
