package Inheritance;

public class HourlyEmployee extends Employee{
    private int hourlyWage;
    private int hoursWorked;

    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, int hourlyWage, int hoursWorked) {
        super(firstName, lastName, socialSecurityNumber);
        this.hourlyWage = hourlyWage;
        this.hoursWorked = hoursWorked;
    }

    public int getHourlyWage() {
        return hourlyWage;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHourlyWage(int newHourlyWage) {
        this.hourlyWage = newHourlyWage;
    }

    public void setHoursWorked(int newHoursWorked) {
        this.hoursWorked = newHoursWorked;
    }
}
