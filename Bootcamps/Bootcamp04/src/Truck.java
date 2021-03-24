public class Truck extends Vehicle {
    private int capacity;
    private int wheels;

    public Truck(String maker, String model, int capacity, int wheels) {
        super(maker, model);
        this.capacity = capacity;
        this.wheels = wheels;
    }

    public Truck(String maker, String model, int capacity, int wheels, int vId) {
        super(maker, model, vId);
        this.capacity = capacity;
        this.wheels = wheels;
    }
}
