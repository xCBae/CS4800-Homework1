package Aggregation;

public class Main {
    public static void main(String[] args) {
        String instructorFirstName = "Nima";
        String instructorLastName = "Davarpanah";
        String instructorOfficeNumber = "3-2636";
        String textbookTitle = "Clean Code";
        String textbookAuthor = "Robert Cecil Martin";
        String textbookPublisher = "Pearson";

        Course course = new Course("Software Engineering", instructorFirstName, instructorLastName, instructorOfficeNumber, textbookTitle, textbookAuthor, textbookPublisher);
        course.printDetails();
    }
}
