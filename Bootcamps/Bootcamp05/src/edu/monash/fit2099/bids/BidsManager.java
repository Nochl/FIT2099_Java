package edu.monash.fit2099.bids;

import edu.monash.fit2099.buyers.Buyer;

import java.util.HashMap;

public class BidsManager {
    private int numBids = 0;
    HashMap<Integer, Bid> bids= new HashMap<Integer,Bid>();



    public void addBid(int buyerId, int bidPrice, String bidDate) {
        bids.put(buyerId, new Bid((numBids+1), new Buyer(buyerId), bidPrice, bidDate));
        numBids++;

    }
}
