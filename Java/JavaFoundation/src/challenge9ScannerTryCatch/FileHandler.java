package challenge9ScannerTryCatch;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileHandler {

    public void readProfile(String fileName) throws FileNotFoundException, IOException {
        FileReader reader = new FileReader(fileName);
        System.out.println("File " + fileName + " opened successfully.");
        if (fileName.equals("profile.txt")) {
            System.out.println("found profile name");

        }
        reader.close();

    }
}
