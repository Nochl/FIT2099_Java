package edu.monash.fit2099;

import java.util.Scanner;

/**
 * Runs the whole Java application
 * Impliments the menu system in console along with accessing all the available methods
 * @author Enoch Leow
 * @version 1.0
 * @see AutoShowroom
 * @
 */
public class AutoShowroomDriver{
    /**
     * Initialises and runs the applications menu and its functionalities
     * @param args Input when starting program
     */
    public static void main(String[] args){
        int selection;

        AutoShowroom autoShowroom = new AutoShowroom();

        do {
            selection=selectMenuItem();
            switch (selection) {
                case 1:
                    autoShowroom.createSedan();
                    break;

                case 2:
                    autoShowroom.createTruck();
                    break;

                case 3:
                    autoShowroom.displayFleet();
                    break;

                case 4:
                    autoShowroom.createBuyer();
                    break;

                case 5:
                    autoShowroom.displayBuyers();
                    break;

                case 6:
                    autoShowroom.createBid();
                    break;

                }

            }while (selection!=7);

        }

    /**
     * Displays the menu and passes user input to the main method
     * @return integer which tells menu the chosen option
     */
    public static int selectMenuItem() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("+-----------------------------------+");
        System.out.println("|    Welcome To The Autoshowroom!   |");
        System.out.println("+-----------------------------------+");
        System.out.println("What would you like to do today?:");
        System.out.println("1) Create New Sedan");
        System.out.println("2) Create New Truck");
        System.out.println("3) Display Fleet");
        System.out.println("4) Add Buyer");
        System.out.println("5) List Buyers");
        System.out.println("6) Add Bid");
        System.out.println("7) Exit");
        System.out.println("Please Select an Option:");
        int choice = scanner.nextInt();
        return choice;
    }

}