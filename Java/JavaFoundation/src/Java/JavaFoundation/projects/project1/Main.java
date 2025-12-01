package Java.JavaFoundation.projects.project1;

public class Main {
    public static void main(String[]args){
      LibraryManager libraryManager = new LibraryManager();
      try{
        libraryManager.searchByTitle("Java Programming");
        libraryManager.searchByTitle("test"); 
      }
      catch(DocumentNotFoundException e){
        System.err.println(" error message  "+  e.getMessage());
      }
      catch(Exception e){
        System.err.println(" unidentify system error message  "+  e.getMessage());
      }
   
      
      libraryManager.addDocument("B111", new Book("New book", 2024, "new author"));
      libraryManager.displayAll();
      libraryManager.deleteDocument("B111");
      libraryManager.displayAll();
    }
    
}
