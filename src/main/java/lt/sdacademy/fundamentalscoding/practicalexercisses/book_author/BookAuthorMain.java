package lt.sdacademy.fundamentalscoding.practicalexercisses.book_author;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BookAuthorMain {
    public static final String FILE_LOCATION = "C:\\Users\\Ina\\IdeaProjects\\Pradinis\\src\\main\\java\\lt\\sdacademy\\fundamentalscoding\\practicalexercisses\\book_author\\bookData.txt";

    public static void main(String[] args){
        List<Book> bookList = new ArrayList<Book>();

        try(BufferedReader br = new BufferedReader(new FileReader(FILE_LOCATION))){
            String line = br.readLine();
            while(true){
                if(line == null) {break;}

                String[] lineArray = line.split(";");

                List<Author> authorsList = new ArrayList<Author>();
                String[] authorsArray = lineArray[1].split("\\|");
                for (String authorsData : authorsArray){
                    String[] authorsDataArray = authorsData.split(",");
                    authorsList.add(new Author(authorsDataArray[0], authorsDataArray[1], authorsDataArray[2]));
                }

                bookList.add(new Book(
                        lineArray[0],
                        authorsList,
                        Double.parseDouble(lineArray[2]),
                        Integer.parseInt(lineArray[3])
                ));

                line = br.readLine();
            }
        }catch(IOException e){
            System.out.println("Klaida nuskaitant faila");
        }

        for (Book book: bookList) {
            System.out.println(book.toString());
        }
    }


}
