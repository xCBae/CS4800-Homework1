package Polymorphism;

public class CargoShip extends Ship {
    private int cargoCapacity;

    public CargoShip(String name, String year, int cargoCapacity) {
        super(name, year);
        this.cargoCapacity = cargoCapacity;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(int newCargoCapacity) {
        this.cargoCapacity = newCargoCapacity;
    }
    
    @Override
    public void printInfo() {
        System.out.println("Ship name: " + getshipName() + "\nShip cargo capacity (In Tonnage): " + cargoCapacity);
    }
}
