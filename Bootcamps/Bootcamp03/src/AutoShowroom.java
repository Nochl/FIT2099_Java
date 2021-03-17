import java.util.ArrayList;

public class AutoShowroom {
    ArrayList<Car> carList = new ArrayList<Car>();

    public void printStatus() {
        System.out.println("Welcome to FIT2099 Showroom");
        createCars();
        displayCars();
        System.out.println("Thank you for visiting FIT2099 Showroom");
    }

    public void createCars() {
        for (int i = 0; i < 3; i++) {
            carList.add(new Car());
        }
        carList.get(0).setMakeModel("BMW", "X7");
        carList.get(1).setMakeModel("Audi", "A8");
        carList.get(2).setMakeModel("Mercedes", "GLS");
    }

    public void displayCars() {
        for (int i = 0; i < carList.size(); i++) {
            System.out.println("Car ("+(i+1)+") "+carList.get(i).description());
        }

    }
}

