package edu.monash.fit2099.buyers;

/**
 * Class which stores Buyer information
 * @author Enoch Leow
 * @version 1.0.0
 */
public class Buyer {
    /**
     * Buyer idendification number
     */
    private int buyerid;
    /**
     * buyers given name
     */
    private String givenName;
    /**
     * buyers family name
     */
    private String familyName;

    /**
     * Empty constructor
     */
    private Buyer(){
    }

    /**
     * Second Constructor with buyerId
     * @param newBuyerId Integer of Buyer ID
     */
    private Buyer(int newBuyerId) {
        this.buyerid = newBuyerId;
    }

    /**
     * Third Constructor with buyerId and name
     * @param newBuyerId Integer of Buyer ID
     * @param newGivenName String of Given Name with length between 2-15
     * @param newFamilyName String of Family Name with length between 2-15
     */
    private Buyer(int newBuyerId, String newGivenName, String newFamilyName) {
        this.buyerid = newBuyerId;
        this.givenName = newGivenName;
        this.familyName = newFamilyName;
    }

    /**
     * Creates instance of Buyer and impliments its setters with validation to store buyer name
     * @param givenName String of Given Name with length between 2-15
     * @param familyName String of Family Name with length between 2-15
     * @return Instance of buyer if it passes validation, else null
     */
    public static Buyer getInstance(String givenName, String familyName){
        Buyer instance = new Buyer();
        if (instance.setGivenName(givenName) && instance.setFamilyName(familyName)) {
            instance.setGivenName(givenName);
            instance.setFamilyName(familyName);
            return instance;

        }
        else return null;
    }

    /**
     * Setter for buyer Given Name
     * @param givenName String of Given Name with length between 2-15
     * @return True if Given Name with length between 2-15, else false
     */
    public boolean setGivenName(String givenName) {
        boolean isValid=false;
        if ((givenName.length() > 1) && (givenName.length() < 16)) {
            isValid=true;
            this.givenName = givenName;
        }
        return isValid;
    }

    /**
     * Setter for buyer Family Name
     * @param familyName String of Given Name with length between 2-15
     * @return True if Family Name with length between 2-15, else false
     */
    public boolean setFamilyName(String familyName) {
        boolean isValid=false;
        if ((familyName.length() > 1) && (familyName.length() < 16)) {
            isValid=true;
            this.familyName = familyName;
        }
        return isValid;
    }

    /**
     * Returns buyers information
     * @return buyerID, Given name and Family Name
     */
    public String description() {
        return buyerid +" "+ givenName +" "+ familyName;
    }

    /**
     * Returns Buyer identification
     * @return BuyerID
     */
    public int getBuyerid() {
        return buyerid;
    }
}

