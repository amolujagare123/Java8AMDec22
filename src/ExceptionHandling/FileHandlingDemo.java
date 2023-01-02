package ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOError;

public class FileHandlingDemo {

    public static void main(String[] args) throws FileNotFoundException, IOError {

        try {
            FileInputStream fis = new FileInputStream("D:\\amol1.txt");
        } catch (FileNotFoundException e) {
           // throw new RuntimeException(e);
        }

        FileInputStream fis = new FileInputStream("D:\\amol1.txt");

    }
}
