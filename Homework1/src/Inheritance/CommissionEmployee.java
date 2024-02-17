package Inheritance;

public class CommissionEmployee extends Employee{
    private int commissionRate;
    private int grossSales;

    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, int commissionRate, int grossSales) {
        super(firstName, lastName, socialSecurityNumber);
        this.commissionRate = commissionRate;
        this.grossSales = grossSales;
    }

    public int getCommissionRate() {
        return commissionRate;
    }

    public int getGrossSales() {
        return grossSales;
    }

    public void setCommissionRate(int newCommissionRate) {
        this.commissionRate = newCommissionRate;
    } 

    public void setGrossSales(int newGrossSales) {
        this.grossSales = newGrossSales;
    }
}
