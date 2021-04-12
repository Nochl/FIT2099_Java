package edu.monash.fit2099;

import edu.monash.fit2099.buyers.Buyer;
import edu.monash.fit2099.vehicles.Sedan;
import edu.monash.fit2099.vehicles.Truck;
import edu.monash.fit2099.vehicles.Vehicle;

import java.util.ArrayList;
import java.util.Scanner;

public class AutoShowroom {
    ArrayList<Vehicle> vehicleList = new ArrayList<Vehicle>();
    ArrayList<Buyer> buyerList = new ArrayList<Buyer>();


    public void createSedan() {
        Scanner gui = new Scanner(System.in);
        System.out.println("---------------------------");
        System.out.println("Please Enter The Following Details");
        System.out.print("Maker: ");
        String maker = gui.next();
        System.out.print("Model: ");
        String model = gui.next();
        System.out.print("Number of Seats: ");
        int seats = gui.nextInt();
        System.out.print("Vehicle ID: ");
        int vId = gui.nextInt();

        vehicleList.add(new Sedan(maker, model, seats, vId));
    }


    public void createTruck() {
        Scanner gui = new Scanner(System.in);
        System.out.println("---------------------------");
        System.out.println("Please Enter The Following Details");
        System.out.print("Maker: ");
        String maker = gui.next();
        System.out.print("Model: ");
        String model = gui.next();
        System.out.print("Number of Wheels: ");
        int wheels = gui.nextInt();
        System.out.print("Vehicle ID: ");
        int vId = gui.nextInt();

        vehicleList.add(new Truck(maker, model, wheels, vId));
    }

    public void createBuyer() {
        Scanner gui = new Scanner(System.in);
        System.out.println("---------------------------");
        System.out.println("Please Enter The Following Details");
        System.out.print("Given Name: ");
        String gName = gui.next();
        System.out.print("Family Name: ");
        String fName = gui.next();
        buyerList.add(new Buyer((buyerList.size()+1), gName, fName));
    }

    public void createBid() {
        Scanner gui = new Scanner(System.in);
        System.out.println("---------------------------");
        System.out.println("Please Enter The Following Details");
        System.out.print("Vehicle ID: ");
        int vId = gui.nextInt();
        System.out.print("Buyer ID: ");
        int buyId = gui.nextInt();
        System.out.print("Price: ");
        int price = gui.nextInt();
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

