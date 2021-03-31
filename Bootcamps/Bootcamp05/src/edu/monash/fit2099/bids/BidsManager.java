package edu.monash.fit2099.bids;

import java.util.HashMap;

public class BidsManager {
    private int numBids = 0;
    public HashMap<Integer, Bid> bids;

    public BidsManager() {
        bids = new HashMap<Integer,Bid>();
    }

    public void addBid(int buyerId, int bidPrice, String bidDate) {
        bids.put(buyerId, new Bid((numBids+1), buyerId, bidPrice, bidDate));
        numBids++;

    }
}
