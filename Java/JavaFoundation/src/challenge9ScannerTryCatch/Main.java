package challenge9ScannerTryCatch;

public class Main {
    public static void main(String[] args) {
    FileHandler fileHandler = new FileHandler();
 try{
    fileHandler.readProfile("profile.txt");
     fileHandler.readProfile("data.txt");
 }
 catch(Exception e){
    System.err.println(" error message  "+  e.getMessage());
 }
 finally{
    System.out.println("Execution completed.");
 }
}

}