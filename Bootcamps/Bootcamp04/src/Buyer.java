public class Buyer {
    private int buyerid;
    private String givenName;
    private String familyName;

    public Buyer(int newBuyerId) {
        this.buyerid = newBuyerId;
    }

    public Buyer(int newBuyerId, String newGivenName, String newFamilyName) {
        this.buyerid = newBuyerId;
        this.givenName = newGivenName;
        this.familyName = newFamilyName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public String description() {
        return buyerid +" "+ givenName +" "+ familyName;
    }

}

