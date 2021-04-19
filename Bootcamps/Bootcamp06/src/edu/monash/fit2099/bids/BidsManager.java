package edu.monash.fit2099.bids;

import edu.monash.fit2099.exceptions.BidException;

import java.util.HashMap;

/**
 * Class which holds a vehicles bids in a HashMap
 * @author Enoch Leow
 * @version 1.0.0
 * @see BidException
 */
public class BidsManager {
    /**
     * stores current number of bids as an interator
     */
    private int numBids = 0;
    /**
     * stores Bid objects in a hashmap
     */
    public HashMap<Integer, Bid> bids;

    /**
     * Creates instance of BidsManager when the class is called
     */
    public BidsManager() {
        bids = new HashMap<Integer,Bid>();
    }

    /**
     * Adds a bid to the bids HashMap with validation
     * @param buyerId integer of buyerID
     * @param bidPrice integer of bid price
     * @param bidDate String of date in format dd/mm/yyyy
     */
    public void addBid(int buyerId, int bidPrice, String bidDate) {
        try {
            bids.put(buyerId, new Bid((numBids), buyerId, bidPrice, bidDate));
            numBids++;
        }
        catch (BidException e) {
            System.out.println(e.getMessage());
        }

    }
}
