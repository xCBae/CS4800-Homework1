package Inheritance;

public class Main {
    public static void main(String[] args) {
        SalariedEmployee salariedEmployee1 = new SalariedEmployee("Joe", "Jones", "111-11-1111", 2500);
        SalariedEmployee salariedEmployee2 = new SalariedEmployee("Renwa", "Chanel", "555-55-5555", 1700);

        HourlyEmployee hourlyEmployee1 = new HourlyEmployee("Stephanie", "Smith", "222-22-2222", 25, 32);
        HourlyEmployee hourlyEmployee2 = new HourlyEmployee("Mary", "Quinn", "333-33-3333", 19, 47);

        CommissionEmployee commissionEmployee1 = new CommissionEmployee("Nicole", "Dior", "444-44-4444", 15, 50000);
        CommissionEmployee commissionEmployee2 = new CommissionEmployee("Mahnaz", "Vaziri", "777-77-7777", 22, 40000);

        BaseEmployee baseEmployee1 = new BaseEmployee("Mike", "Davenport", "666-66-6666", 95000);

        System.out.println(
            "\nWeekly Salary Employees:\n" +
            salariedEmployee1.getFirstName()    + ", " +
            salariedEmployee1.getLastName()     + ", " +
            salariedEmployee1.getsocialSecurityNumber()          + ", " +
            salariedEmployee1.getWeeklySalary() + "\n" +

            salariedEmployee2.getFirstName()    + ", " +
            salariedEmployee2.getLastName()     + ", " +
            salariedEmployee2.getsocialSecurityNumber()          + ", " +
            salariedEmployee2.getWeeklySalary() + "\n" +

            "\nHourly Salary Employees:\n" +
            hourlyEmployee1.getFirstName()    + ", " +
            hourlyEmployee1.getLastName()     + ", " +
            hourlyEmployee1.getsocialSecurityNumber()          + ", " +
            hourlyEmployee1.getHourlyWage()   + ", " +  
            hourlyEmployee1.getHoursWorked()  + "\n" +

            hourlyEmployee2.getFirstName()    + ", " +
            hourlyEmployee2.getLastName()     + ", " +
            hourlyEmployee2.getsocialSecurityNumber()          + ", " +
            hourlyEmployee2.getHourlyWage()   + ", " +  
            hourlyEmployee2.getHoursWorked()  + "\n" +

            "\nCommission Based Employees:\n" +
            commissionEmployee1.getFirstName()      + ", " +
            commissionEmployee1.getLastName()       + ", " +
            commissionEmployee1.getsocialSecurityNumber()            + ", " +
            commissionEmployee1.getCommissionRate() + ", " +
            commissionEmployee1.getGrossSales()     + "\n" +

            commissionEmployee2.getFirstName()      + ", " +
            commissionEmployee2.getLastName()       + ", " +
            commissionEmployee2.getsocialSecurityNumber()            + ", " +
            commissionEmployee2.getCommissionRate() + ", " +
            commissionEmployee2.getGrossSales()     + "\n" +

            "\nBase Salary Employees:\n" +
            baseEmployee1.getFirstName()    + ", " +
            baseEmployee1.getLastName()     + ", " +
            baseEmployee1.getsocialSecurityNumber()          + ", " +
            baseEmployee1.getBaseSalary()   + "\n"
            );
    }
}
