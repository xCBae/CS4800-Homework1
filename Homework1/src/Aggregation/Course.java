package Aggregation;

public class Course {
    private String name;
    private String instructorFirstName;
    private String instructorLastName;
    private String instructorOfficeNumber;
    private String textbookTitle;
    private String textbookAuthor;
    private String textbookPublisher;

    public Course(String name, String instructorFirstName, String instructorLastName, String instructorOfficeNumber, String textbookTitle, String textbookAuthor, String textbookPublisher) {
        this.name = name;
        this.instructorFirstName = instructorFirstName;
        this.instructorLastName = instructorLastName;
        this.instructorOfficeNumber = instructorOfficeNumber;
        this.textbookTitle = textbookTitle;
        this.textbookAuthor = textbookAuthor;
        this.textbookPublisher = textbookPublisher;
    }

    public void printDetails() {
        System.out.println("\nCourse name: " + name);
        System.out.println("Instructor: " + instructorFirstName + " " + instructorLastName + " " + instructorOfficeNumber);
        System.out.println("Textbook: " + textbookTitle + " " + textbookAuthor + " " + textbookPublisher + "\n");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInstructorFirstName() {
        return instructorFirstName;
    }

    public void setInstructorFirstName(String instructorFirstName) {
        this.instructorFirstName = instructorFirstName;
    }

    public String getInstructorLastName() {
        return instructorLastName;
    }

    public void setInstructorLastName(String instructorLastName) {
        this.instructorLastName = instructorLastName;
    }

    public String getInstructorOfficeNumber() {
        return instructorOfficeNumber;
    }

    public void setInstructorOfficeNumber(String instructorOfficeNumber) {
        this.instructorOfficeNumber = instructorOfficeNumber;
    }

    public String getTextbookTitle() {
        return textbookTitle;
    }

    public void setTextbookTitle(String textbookTitle) {
        this.textbookTitle = textbookTitle;
    }

    public String getTextbookAuthor() {
        return textbookAuthor;
    }

    public void setTextbookAuthor(String textbookAuthor) {
        this.textbookAuthor = textbookAuthor;
    }

    public String getTextbookPublisher() {
        return textbookPublisher;
    }

    public void setTextbookPublisher(String textbookPublisher) {
        this.textbookPublisher = textbookPublisher;
    }
}
