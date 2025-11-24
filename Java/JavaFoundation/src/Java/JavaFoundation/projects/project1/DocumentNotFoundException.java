package Java.JavaFoundation.projects.project1;

public class DocumentNotFoundException extends Exception {
    public DocumentNotFoundException(String title) {
        super("Document with title " + title + " not found.");
    }
    
}
