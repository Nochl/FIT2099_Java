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

public class AutoShowroom {
    ArrayList<Vehicle> vehicleList = new ArrayList<>();
    ArrayList<Buyer> buyerList = new ArrayList<>();


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

    public void displayBuyers() {
        System.out.println("---------------------------");
        System.out.println("Current Buyers");
        for (Buyer buyer : buyerList) {
            System.out.println(buyer.description());
        }
    }

}

