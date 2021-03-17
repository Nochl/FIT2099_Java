public class buyer {
    private int buyerid;
    private String givenName;
    private String familyName;

    public buyer(int newBuyerId) {
        this.buyerid = newBuyerId;
    }

    public buyer(int newBuyerId, String newGivenName, String newFamilyName) {
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

