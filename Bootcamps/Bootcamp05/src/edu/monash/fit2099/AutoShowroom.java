package edu.monash.fit2099;

import edu.monash.fit2099.buyers.Buyer;
import edu.monash.fit2099.exceptions.SedanException;
import edu.monash.fit2099.exceptions.TruckException;
import edu.monash.fit2099.exceptions.VehicleException;
import edu.monash.fit2099.vehicles.Sedan;
import edu.monash.fit2099.vehicles.Truck;
import edu.monash.fit2099.vehicles.Vehicle;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * The AutoShowroom Class stores Cars and Buyers in 2 arraylists
 * It also contains all methods used by the I/O menu
 * These methods include creating vehicles, buyers, bids along with displaying cars and buyers
 * @author Enoch Leow
 * @version 1.0.0
 * @see Buyer
 * @see Sedan
 * @see Truck
 * @see Vehicle
 * @see SedanException
 * @see TruckException
 * @see VehicleException
 */

public class AutoShowroom {
    /**
     * Stores Vehicle objects in an ArrayList
     */
    ArrayList<Vehicle> vehicleList = new ArrayList<>();
    /**
     * Stores Buyer objects in an ArrayList
     */
    ArrayList<Buyer> buyerList = new ArrayList<>();


    /**
     * Creates a Truck instance by taking the users input through the console and adds it to the vehicleList Arraylist
     */
    public void createSedan() {
        Scanner gui = new Scanner(System.in);
        System.out.println("---------------------------");
        System.out.println("Please Enter The Following Details");
        System.out.print("Maker: ");
        String maker = gui.next();
        System.out.print("Model: ");
        String model = gui.next();

        Integer seats = null;
        while (seats == null) {
            System.out.print("Number of Seats: ");
            try {
                seats = gui.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("String Values are not valid for seats");
                gui.nextLine();
            }
        }

        Integer vId = null;
        while (vId == null) {
            System.out.print("Vehicle ID: ");
            try {
                vId = gui.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("String Values are not valid for Vehicle ID");
                gui.nextLine();
            }
        }

        try {
            vehicleList.add(new Sedan(maker, model, seats, vId));
        }
        catch (SedanException e) {
            System.out.println(e.getMessage());
        }
        catch (VehicleException e) {
            System.out.println(e.getMessage());
        }
    }


    /**
     * Creates a Truck instance by taking the users input through the console and adds it to the vehicleList Arraylist
     */
    public void createTruck() {
        Scanner gui = new Scanner(System.in);
        System.out.println("---------------------------");
        System.out.println("Please Enter The Following Details");
        System.out.print("Maker: ");
        String maker = gui.next();
        System.out.print("Model: ");
        String model = gui.next();

        Integer wheels = null;
        while (wheels == null) {
            System.out.print("Number of Wheels: ");
            try {
                wheels = gui.nextInt();
            }
            catch (InputMismatchException e) {
                System.out.println("String Values are not valid for Wheels");
                gui.nextLine();
            }
        }

        Integer capacity = null;
        while (capacity == null) {
            System.out.print("Vehicle Capacity: ");
            try {
                capacity = gui.nextInt();
            }
            catch (InputMismatchException e){
                System.out.println("String Values are not valid for capacity");
                gui.nextLine();
            }
        }

        try {
            vehicleList.add(new Truck(maker, model, wheels, capacity));
        }
        catch (TruckException e) {
            System.out.println(e.getMessage());
        }
        catch (VehicleException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Creates a Buyer instance by taking the users input through the console and adds it to the buyerList Arraylist
     */
    public void createBuyer() {
        Scanner gui = new Scanner(System.in);
        System.out.println("---------------------------");
        System.out.println("Please Enter The Following Details");
        System.out.print("Given Name: ");
        String gName = gui.next();
        System.out.print("Family Name: ");
        String fName = gui.next();
        Buyer buyer = Buyer.getInstance(gName, fName);
        if (buyer != null) {
            buyerList.add(buyer);
            System.out.print(buyer);
        }
        else System.out.print("Something wrong with the buyer's values!!!");
    }

    /**
     * Creates a Bid instance by taking the users input through the console and stores it in the given vehicles' instance
     */
    public void createBid() {
        Scanner gui = new Scanner(System.in);
        System.out.println("---------------------------");
        System.out.println("Please Enter The Following Details");

        Integer vId = null;
        while (vId == null) {
            System.out.print("Vehicle ID: ");
            try {
                vId = gui.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("String Values are not valid for Vehicle ID");
                gui.nextLine();
            }
        }

        Integer buyId = null;
        while (buyId == null) {
            System.out.print("Buyer ID: ");
            try {
                buyId = gui.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("String Values are not valid for Buyer ID");
                gui.nextLine();
            }
        }

        Integer price = null;
        while (price == null) {
            System.out.print("Price: ");
            try {
                price = gui.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("String Values are not valid for Price");
                gui.nextLine();
            }
        }

        System.out.print("Date: ");
        String date = gui.next();
        for (Vehicle vehicle : vehicleList) {
            if (vehicle.getVId() == vId) {
                vehicle.bids.addBid(buyId, price, date);
            }
        }

    }

    /**
     * Prints the details of vehicles stored in the vehicleList along with any of its bids
     */
    public void displayFleet() {
        int id = 1;
        System.out.println("---------------------------");
        System.out.println("Current Vehicles In Fleet");
        for (Vehicle vehicle : vehicleList) {

            System.out.println("Vehicle "+(id) + ": " + vehicle.description());
                for (Integer key: vehicle.bids.bids.keySet())
                    System.out.println("Bid "+key+": BuyerID: "+ vehicle.bids.bids.get(key).getBuyer() +" BidPrice: $"+vehicle.bids.bids.get(key).getPrice());
            id++;
        }
    }

    /**
     * Prints the details of each buyer within buyerList
     */
    public void displayBuyers() {
        System.out.println("---------------------------");
        System.out.println("Current Buyers");
        for (Buyer buyer : buyerList) {
            System.out.println(buyer.description());
        }
    }

}

