public class Sedan extends Vehicle {
    private int seats;

    public Sedan(String maker, String model, int seats) {
        super(maker, model);
        this.seats = seats;
    }

    public Sedan(String maker, String model, int seats, int vId) {
        super(maker, model, vId);
        this.seats = seats;
    }
}
