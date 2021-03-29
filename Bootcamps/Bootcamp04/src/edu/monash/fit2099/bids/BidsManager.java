package edu.monash.fit2099.bids;

import edu.monash.fit2099.buyers.Buyer;

import java.util.HashMap;

public class BidsManager {
    private int numBids = 0;
    private HashMap<Integer, Bid> bidManager;



    public void addBid(int buyerId, int bidPrice, String bidDate) {
        bidManager.put(buyerId, new Bid((numBids+1), new Buyer(buyerId), bidPrice, bidDate));
        numBids++;

    }
}
