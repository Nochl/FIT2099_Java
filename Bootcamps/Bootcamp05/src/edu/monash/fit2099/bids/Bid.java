package edu.monash.fit2099.bids;

import edu.monash.fit2099.exceptions.BidException;

/**
 * Class which is used to store bid information
 * @author Enoch Leow
 * @version 1.0.0
 * @see BidException
 */
public class Bid {
    /**
     * Bid Identification number
     */
    private int bidId;
    /**
     * Buyer Identification number
     */
    private int buyerid;
    /**
     * Bid Price
     */
    private int price;
    /**
     * Date of bid
     */
    private String date;

    /**
     * getter for BidID
     * @return integer Bid ID
     */
    public int getBidId() {
        return bidId;
    }

    /**
     * setter for BidID
     * @param bidId integer Bid ID
     */
    public void setBidId(int bidId) {
        this.bidId = bidId;
    }

    /**
     * getter for BuyerID
     * @return integer Buyer ID
     */
    public int getBuyer() {
        return buyerid;
    }

    /**
     * Setter for BuyerID
     * @param buyerid integer Buyer ID
     */
    public void setBuyer(int buyerid) {
        this.buyerid = buyerid;
    }

    /**
     * getter for bid price
     * @return integer bid price
     */
    public int getPrice() {
        return price;
    }

    /**
     * setter for bid price
     * @param price bid price integer > 0
     * @return true if bid price > 0, else false
     */
    public boolean setPrice(int price) {
        boolean isValid=false;
        if(price >=0) {
            isValid = true;
            this.price = price;
        }
        return isValid;
    }

    /**
     * getter for bid date
     * @return string of bid date in the formal dd/mm/yyyy
     */
    public String getDate() {
        return date;
    }

    /**
     * Setter for date with validation
     * @param date string with format dd/mm/yyyy
     * @return true if date is string and matches thr format dd/mm/yyyy
     */
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


    /**
     * Bid constructor with validation
     * @param bidId integer of bid ID
     * @param buyerid integer of buyer ID
     * @param price integer of bid price > 0
     * @param date string of date with format dd/mm/yyyy
     * @throws BidException if bid date does not match format
     */
    public Bid(int bidId, int buyerid, int price, String date) throws BidException {
        if (setDate(date)) {
            this.bidId = bidId;
            this.buyerid = buyerid;
            this.price = price;
            this.date = date;
        }
        else {
            throw new BidException("Invalid Date");
        }
    }


}
