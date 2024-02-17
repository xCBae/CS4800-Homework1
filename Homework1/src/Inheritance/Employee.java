package Inheritance;

public class Employee {
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;

    public Employee(String firstName, String lastName, String socialSecurityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getsocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setFirstName(String newFirstName) {
        this.firstName = newFirstName; 
    }

    public void setLastName(String newLastName) {
        this.lastName = newLastName;
    }

    public void setsocialSecurityNumber(String newsocialSecurityNumber) {
        this.socialSecurityNumber = newsocialSecurityNumber;
    }
}
