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

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Bid(int bidId, Buyer buyer, int price, String date) {
        this.bidId = bidId;
        this.buyer = buyer;
        this.price = price;
        this.date = date;
    }

}
