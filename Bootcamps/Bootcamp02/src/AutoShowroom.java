public class AutoShowroom {
    Car[] carArray= new Car[3];

    public void printStatus() {
        System.out.println("Welcome to FIT2099 Showroom");
        createCars();
        displayCars();
        System.out.println("Thank you for visiting FIT2099 Showroom");
    }

    public void createCars() {
        for (int i = 0; i < 3; i++) {
            carArray[i] = new Car();
        }
        carArray[0].setMakeModel("BMW", "X7");
        carArray[1].setMakeModel("Audi", "A8");
        carArray[2].setMakeModel("Mercedes", "GLS");
    }

    public void displayCars() {
        for (int i = 0; i < carArray.length; i++) {
            System.out.print("Car ("+(i+1)+") ");
            carArray[i].getCarDescription();

        }
    }
}

