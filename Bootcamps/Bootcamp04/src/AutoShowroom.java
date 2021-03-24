import java.util.ArrayList;
import java.util.Scanner;

public class AutoShowroom {
    ArrayList<Vehicle> vehicleList = new ArrayList<Vehicle>();


    public void printStatus() {
        System.out.println("Welcome to FIT2099 Showroom");
        createCars();
        displayCars();
        System.out.println("Thank you for visiting FIT2099 Showroom");
    }

    public void createCars() {
        for (int i = 0; i < 3; i++) {
            vehicleList.add(new Vehicle());
        }

        vehicleList.get(0).setMakeModel("BMW", "X7");
        vehicleList.get(1).setMakeModel("Audi", "A8");
        vehicleList.get(2).setMakeModel("Mercedes", "GLS");

        for (int j = 0; j < 3; j++) {
            Scanner gui = new Scanner(System.in);
            System.out.println("---------------------------");
            System.out.println("Please Enter The Following Details");
            System.out.print("Given Name: ");
            String gName = gui.next();
            System.out.print("Family Name: ");
            String fName = gui.next();
            System.out.print("Buyer ID: ");
            int buyId = gui.nextInt();
            System.out.print("Bid Price: ");
            int bidPrice = gui.nextInt();
            System.out.print("Date: ");
            String date = gui.next();

            Buyer person1 = new Buyer(buyId, gName, fName);
            vehicleList.get(j).addBid(person1, bidPrice, date);
        }

    }


    public void displayCars() {
        System.out.println("---------------------------");
        for (int i = 0; i < vehicleList.size(); i++) {
            System.out.println("Car (" + (i + 1) + ") " + vehicleList.get(i).description());

            for (int j = 0; j < vehicleList.get(i).bids.size(); j++) {
                System.out.println("Buyer: " + (vehicleList.get(i).bids.get(j).getBuyer().description()) + "  Price: " + (vehicleList.get(i).bids.get(j).getPrice()));
            }

            System.out.println();

        }
    }
}

