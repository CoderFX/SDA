package lt.sdacademy.fundamentals.file_read.scanner;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import static lt.sdacademy.fundamentals.file_read.Util.FILE_LOCATION;

public class ScannerExampleMain {
    public static void main(String[] args){
        ///need to close
        try{
            Scanner fileScanner = new Scanner(new File(FILE_LOCATION));
            while (fileScanner.hasNext()){
                System.out.println(fileScanner.nextLine());
            }
            fileScanner.close();
        }catch (IOException e){
            System.out.println("KLAIDA!");
        }

        //Closes automaticaly
        try(Scanner fileScanner = new Scanner(new File(FILE_LOCATION))) {
            while (fileScanner.hasNext()) {
                System.out.println(fileScanner.nextLine());
            }
        }catch (IOException e){
            System.out.println("KLAIDA!");
        }
    }
}
