package lt.sdacademy.homework2.antras_dog;

import java.util.*;

public class DogMain {

    public static void main(String[] args) {
        List<Dog> dogList = new ArrayList<Dog>();
        Scanner stringScanner = new Scanner(System.in);
        String inputText;

        for (int i = 1; i <= 3; i++) {
            System.out.print("Įveskite šuns Nr." + i + " vardą, amžių ir spalvą atskiriant kableliais: ");
            inputText = stringScanner.nextLine();
            if (inputText.matches(".*\\w+.*\\,\\s*\\d+\\s*\\,.*\\w+.*")) {
                String[] dataParse = inputText.split(",");
                dogList.add(new Dog(dataParse[0].trim(), Integer.parseInt(dataParse[1].trim()), dataParse[2].trim()));
            } else {
                System.out.println(" NETINKAMI DUOMENYS, neišsaugota");
                i--;
            }
        }
        System.out.println("Vyriausias šuo yra "+findEldest(dogList));
        System.out.println("Šunų vidurkis yra "+getAgeAverage(dogList));
    }

    private static String findEldest(List<Dog> dogList){
        Dog maxAge = dogList.get(0);
        for (Dog candidate: dogList){
            if(candidate.getAge() > maxAge.getAge()){
                maxAge = candidate;
            }
        }
        //Dog maxAge = Collections.max(dogList, Comparator.comparing(s -> s.getAge()));
        return maxAge.getName();
    }
    private static double getAgeAverage(List<Dog> dogList){
        int sum = 0;
        for (Dog entry: dogList){
            sum += entry.getAge();
        }
        return sum / dogList.size();
    }
}
