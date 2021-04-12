package edu.monash.fit2099.buyers;

public class Buyer {
    private int buyerid;
    private String givenName;
    private String familyName;

    private Buyer(){
    }

    private Buyer(int newBuyerId) {
        this.buyerid = newBuyerId;
    }

    private Buyer(int newBuyerId, String newGivenName, String newFamilyName) {
        this.buyerid = newBuyerId;
        this.givenName = newGivenName;
        this.familyName = newFamilyName;
    }

    public static Buyer getInstance(String givenName, String familyName){
        Buyer instance = new Buyer();
        if (instance.setGivenName(givenName) && instance.setFamilyName(familyName)) {
            instance.setGivenName(givenName);
            instance.setFamilyName(familyName);
            return instance;

        }
        else return null;
    }

    public boolean setGivenName(String givenName) {
        boolean isValid=false;
        if ((givenName.length() > 1) && (givenName.length() < 16)) {
            isValid=true;
            this.givenName = givenName;
        }
        return isValid;
    }

    public boolean setFamilyName(String familyName) {
        boolean isValid=false;
        if ((familyName.length() > 1) && (familyName.length() < 16)) {
            isValid=true;
            this.familyName = familyName;
        }
        return isValid;
    }

    public String description() {
        return buyerid +" "+ givenName +" "+ familyName;
    }


}

