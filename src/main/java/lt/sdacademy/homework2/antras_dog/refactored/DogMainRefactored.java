package lt.sdacademy.homework2.antras_dog.refactored;

import lt.sdacademy.homework2.antras_dog.Dog;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DogMainRefactored {
    private static final String FILE_LOCATION ="C:/Users/Ina/IdeaProjects/Pradinis/src/lt/sdacademy/homework2/antras_dog/refactored/DogsData.txt";

    public static void main(String[] args) {
        System.out.println("(scanner) Vyriausias šuo yra "+findEldest(getDogsFromFileScanner()));
        System.out.println("(scanner) Šunų vidurkis yra "+getAgeAverage(getDogsFromFileScanner()));

        System.out.println("(buffered) Vyriausias šuo yra "+findEldest(getDogsFromFileBuffered()));
        System.out.println("(buffered) Šunų vidurkis yra "+getAgeAverage(getDogsFromFileBuffered()));
    }

    private static List<Dog> getDogsFromFileBuffered() {
        List<Dog> dogList = new ArrayList<Dog>();
        try (BufferedReader br = new BufferedReader((new FileReader(FILE_LOCATION)))) {

            String line=br.readLine();
            while (line != null){
                dogList.add(makeDog(line));
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("KLAIDA!");
        }
        return dogList;
    }

    private static List<Dog> getDogsFromFileScanner() {
        List<Dog> dogList = new ArrayList<Dog>();
        try(Scanner fileScanner = new Scanner(new File(FILE_LOCATION))) {
            while (fileScanner.hasNext()){
                String line = fileScanner.nextLine();
                dogList.add(makeDog(line));
            }
        }  catch (IOException e){
            System.out.println("KLAIDA");
        }
        return dogList;
    }

    private static Dog makeDog(String line){
        String[] dataParse = line.split(",");
        return new Dog(dataParse[0].trim(), Integer.parseInt(dataParse[1].trim()), dataParse[2].trim());
    }

    private static String findEldest(List<Dog> dogList){
        Dog maxAge = dogList.get(0);
        for (Dog candidate: dogList){
            if(candidate.getAge() > maxAge.getAge()){
                maxAge = candidate;
            }
        }
        //Dog maxAge = Collections.max(dogList, Comparator.comparing(s -> s.getAge()));
        return maxAge.getName()+" Amžius: "+maxAge.getAge();
    }
    private static double getAgeAverage(List<Dog> dogList){
        int sum = 0;
        for (Dog entry: dogList){
            sum += entry.getAge();
        }
        return (double) sum / dogList.size();
    }
}
