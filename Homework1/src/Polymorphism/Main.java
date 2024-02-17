package Polymorphism;

public class Main {
    public static void main(String[] args) {
        Ship[] shipTypes = new Ship[3];

        shipTypes[0] = new Ship("Ship", "2000");
        shipTypes[1] = new CruiseShip("Cruise Ship", "2010", 3000);
        shipTypes[2] = new CargoShip("Cargo Ship", "2020", 9000);

        for (Ship ship: shipTypes) {
            ship.printInfo();
            System.out.println();
        }
    }
}
