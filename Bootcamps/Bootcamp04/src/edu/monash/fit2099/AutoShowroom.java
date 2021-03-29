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

    /*

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
     */

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
        for (int i = 0; i <vehicleList.size(); i++){
            if (vehicleList.get(i).getVId() == vId) {
                vehicleList.get(i).bids.addBid(buyId, price, date);
            }
        }

    }

    public void displayFleet() {
        System.out.println("---------------------------");
        System.out.println("Current Vehicles In Fleet");
        for (int i = 0; i <vehicleList.size(); i++) {
            System.out.println((i+1)+": "+vehicleList.get(i).description());
        }
    }

    public void displayBuyers() {
        System.out.println("---------------------------");
        System.out.println("Current Buyers");
        for (int i = 0; i <buyerList.size(); i++) {
            System.out.println((i+1)+": "+buyerList.get(i).description());
        }
    }

    /*

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

     */
}

