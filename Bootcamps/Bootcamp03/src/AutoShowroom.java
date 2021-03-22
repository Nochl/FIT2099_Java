import java.util.ArrayList;
import java.util.Scanner;

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
            carList.get(j).addBid(person1, bidPrice, date);
        }

    }


    public void displayCars() {
        System.out.println("---------------------------");
        for (int i = 0; i < carList.size(); i++) {
            System.out.println("Car (" + (i + 1) + ") " + carList.get(i).description());

            for (int j = 0; j < carList.get(i).bids.size(); j++) {
                System.out.println("Buyer: " + (carList.get(i).bids.get(j).getBuyer().description()) + "  Price: " + (carList.get(i).bids.get(j).getPrice()));
            }

            System.out.println();

        }
    }

    /*
    public int createBidBuyer() {
        Scanner gui = new Scanner(System.in);
        System.out.println("Please Enter The Following Details");
        System.out.println("Given Name: ");
        String gName = gui.next();
        System.out.println("Family Name: ");
        String fName = gui.next();
        System.out.println("Buyer ID: ");
        String buyId = gui.next();
        System.out.println("Bid Price: ");
        String bidPrice = gui.next();
        System.out.println("Date: ");
        String date = gui.next();


    }

     */
}

