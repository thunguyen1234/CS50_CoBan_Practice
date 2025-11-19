package Java.JavaFoundation.projects.project1;

import java.util.HashMap;

public class LibraryManager {
    //declare hashmap to store documents
    HashMap<String, Document> documents;
    //constructor
    public LibraryManager(){
        //initialize hashmap
        documents = new HashMap<>();
        documents.put("B001", new Book("Java Programming", 2020, "John Doe"));
        documents.put("D001", new Book("Science Daily", 2021, "Jane Smith"));
       

    }
    public void searchByTitle(String title){
if(documents.get(title).equals(title)){
    System.out.println("Document found: " + title);

}
    }
    
}
