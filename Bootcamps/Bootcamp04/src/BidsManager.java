import java.util.HashMap;

public class BidsManager {
    private int numBids = 0;
    private HashMap<Integer, String> bidManager;

    public BidsManager() {
        HashMap<Integer, Bid> bidManager = new HashMap<Integer, Bid>();
    }

    public void addBid(int buyerId, int bidPrice, String bidDate) {
        bidManager.put(buyerId, new Bid((numBids+1), new Buyer(buyerId), bidPrice, bidDate);
        numBids++;
    }
}
