package lt.sdacademy.fundamentalscoding.practicalexercisses.workers;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WorkersMain {
    public static final String FILE_LOCATION = "C:/Users/Ina/IdeaProjects/Pradinis/src/main/java/lt/sdacademy/fundamentalscoding/practicalexercisses/workers/workersData.txt";

    public static void main(String[] args) {
        System.out.println("Vid darbuotojų amžius: "+ getAgeAverage(makeWorkersListFromFile()));
        System.out.println("Vid Atlyginimas: "+getSalaryAverage(makeWorkersListFromFile()));
        System.out.println("Jauniausias: "+getYoungestWorker(makeWorkersListFromFile()).getName());
        System.out.println("Didžiausias atlyginimas: "+getMaxSalary(makeWorkersListFromFile()).getSalary());
    }

    public static List<Workers> makeWorkersListFromFile(){
        List<Workers> workersList = new ArrayList<Workers>();
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_LOCATION))) {
            String line = br.readLine();
            while (line != null){
                String[] workerDataArray = line.split(";");
                workersList.add(new Workers(
                        workerDataArray[0],
                        Double.parseDouble(workerDataArray[1]),
                        Integer.parseInt(workerDataArray[2]),
                        workerDataArray[3].toCharArray()[0]
                ));

                line = br.readLine();
            }

        } catch (IOException e) {
            System.out.println("Klaida skaitant failą!");
        }
        return workersList;
    }

    public static double getSalaryAverage(List<Workers> workersList){
        double sum = 0;
        for(Workers worker : workersList){
            sum += worker.getSalary();
        }
        return sum / workersList.size();
    }

    public static double getAgeAverage(List<Workers> workersList){
        int sum = 0;
        for(Workers worker : workersList){
            sum += worker.getAge();
        }
        return (double) sum / workersList.size();
    }

    public static Workers getMaxSalary(List<Workers> workersList){
        Workers max = workersList.get(0);
        for(Workers worker : workersList){
            if(max.getSalary() < worker.getSalary())
                max = worker;
        }
        return max;
    }

    public static Workers getYoungestWorker(List<Workers> workersList){
        Workers min = workersList.get(0);
        for(Workers worker : workersList){
            if(min.getAge() > worker.getAge())
                min = worker;
        }
        return min;
    }
}