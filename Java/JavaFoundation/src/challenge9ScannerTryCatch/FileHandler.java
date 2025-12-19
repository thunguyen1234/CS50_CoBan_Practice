package challenge9ScannerTryCatch;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class FileHandler {

    public void readProfile(String fileName) {
      //Khai báo tài nguyên reader trong try-with-resources
       try(FileReader reader = new FileReader(fileName))
    {
        // 2. Logic chính được đặt ở đây.
        System.out.println("File " + fileName + " opened successfully.");
        // ... (các lệnh đọc dữ liệu) ...
        if(fileName.equals("profile.txt")) {
           System.out.println("File " + fileName + " found.");
        }   
    }
      catch(FileNotFoundException e){
        System.err.println(" internal method error: file not found  "+ fileName+ "  continue");
      }
      catch(IOException e){
        System.err.println("error I/O undefined file  "+ fileName+  e.getMessage());

    }
}
}
