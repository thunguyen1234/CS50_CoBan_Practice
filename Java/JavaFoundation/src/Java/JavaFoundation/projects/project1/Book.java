package Java.JavaFoundation.projects.project1;

public class Book extends Document{
    String author;
    //constructor
    public Book(String title, int year, String author){
        super (title, year);
        this.author= author;

    }
    
}
