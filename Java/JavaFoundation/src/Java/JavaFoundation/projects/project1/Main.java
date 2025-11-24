package Java.JavaFoundation.projects.project1;

public class Main {
    public static void main(String[]args){
      LibraryManager libraryManager = new LibraryManager();
   //   String bookName = input("Enter book name: ");
      libraryManager.searchByTitle("test");  
      
      try{libraryManager.searchByTitle("test");}
      catch(Exception e){
        System.out.println(e.getMessage());
      }
      
      libraryManager.addDocument("B111", new Book("New book", 2024, "new author"));
      libraryManager.displayAll();
      libraryManager.deleteDocument("B111");
      libraryManager.displayAll();
    }
    
}
