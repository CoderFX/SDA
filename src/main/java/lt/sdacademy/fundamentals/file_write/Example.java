package lt.sdacademy.fundamentals.file_write;

import java.io.*;

public class Example {
    public static final String OUTPUT_FILE_LOCATION = "C:/Users/Ina/IdeaProjects/Pradinis/src/main/java/lt/sdacademy/fundamentals/file_write/result.txt";
    
    public static void main(String[] args){
        String text = "Good morning";

        writeDataToFile(text);
    }

    private static void writeDataToFile(String data){
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(OUTPUT_FILE_LOCATION))) {
            bw.write(data);
        }catch (FileNotFoundException e){
            System.out.println("Failas nerastas");
        }catch (IOException e){
            System.out.println("Klaida rasant duomenis i faila");
        }
    }
}
