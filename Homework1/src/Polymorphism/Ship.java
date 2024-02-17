package Polymorphism;

public class Ship {
    private String shipName;
    private String yearBuilt;

    public Ship(String shipName, String yearBuilt) {
        this.shipName = shipName;
        this.yearBuilt = yearBuilt;
    }

    public String getshipName() {
        return shipName;
    }

    public String getyearBuilt() {
        return yearBuilt;
    }

    public void setshipName(String newshipName) {
        this.shipName = newshipName;
    }

    public void setyearBuilt(String newyearBuilt) {
        this.yearBuilt = newyearBuilt;
    }

    public void printInfo() {
        System.out.println("Name Of The Ship: " + shipName + "\nYear The Ship Was Built: " + yearBuilt);
    }
}
