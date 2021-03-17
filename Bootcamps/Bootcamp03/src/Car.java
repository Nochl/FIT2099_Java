public class Car {

    private String make = null;
    private String model = null;

    public void setMakeModel(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public String description() {
        return "Maker:"+make+" and "+model;
    }

}
