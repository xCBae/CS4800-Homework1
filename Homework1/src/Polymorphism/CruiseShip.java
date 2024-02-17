package Polymorphism;

public class CruiseShip extends Ship {
    private int maxPassengers;

    public CruiseShip(String name, String year, int maxPassengers) {
        super(name, year);
        this.maxPassengers = maxPassengers;
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

    public void setMaxPassengers(int newMaxPassengers) {
        this.maxPassengers = newMaxPassengers;
    }
    
    @Override
    public void printInfo() {
        System.out.println("Name of the Ship: " + getshipName() + "\nMaximum number of passengers: " + maxPassengers);
    }
}
