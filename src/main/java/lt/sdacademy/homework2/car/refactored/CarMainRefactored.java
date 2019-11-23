package lt.sdacademy.homework2.car.refactored;

import lt.sdacademy.homework2.car.Car;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CarMainRefactored {
    private static final String FILE_LOCATION = "C:/Users/Ina/IdeaProjects/Pradinis/src/main/java/lt/sdacademy/homework2/car/refactored/CarsData.txt";

    public static void main(String[] args) {
        List<Car> carList = new ArrayList<Car>();

        Car newestCar = findNewestCar(readCarsFromFile());
        System.out.println("Naujausias auto: " + newestCar.getModel() + " - " + newestCar.getYear());

        double yearAverage = findYearAverage(readCarsFromFile());
        System.out.println("Metų vidurkis: " + yearAverage);

        Car mostExpensiveCar = findMostExpensive(readCarsFromFile());
        System.out.println("Brangiausias auto: " + mostExpensiveCar.getModel() + " - " + mostExpensiveCar.getPrice());

    }

    public static List<Car> readCarsFromFile() {
        List<Car> carList = new ArrayList<Car>();

        try (BufferedReader br = new BufferedReader(new FileReader(FILE_LOCATION))) {
            String line = br.readLine();
            while (line != null) {
                String[] dataArray = line.split(",");

                carList.add(new Car(
                        dataArray[0],
                        Double.parseDouble(dataArray[1]),
                        Integer.parseInt(dataArray[2]),
                        Integer.parseInt(dataArray[3]),
                        getType(Integer.parseInt(dataArray[4]))
                ));

                line = br.readLine();
            }

        } catch (IOException e) {
            System.out.println("KLAIDA!");
        }
        return carList;
    }

    public static Car findNewestCar(List<Car> carList) {
        Car newestCar = carList.get(0);
        for (Car candidate : carList) {
            if (newestCar.getYear() < candidate.getYear()) {
                newestCar = candidate;
            }
        }
        return newestCar;
    }

    public static Car findMostExpensive(List<Car> carList) {
        Car mostExpensiveCar = carList.get(0);
        for (Car candidate : carList) {
            if (mostExpensiveCar.getPrice() < candidate.getPrice()) {
                mostExpensiveCar = candidate;
            }
        }
        return mostExpensiveCar;
    }

    public static double findYearAverage(List<Car> carList) {
        int sum = 0;
        for (Car entry : carList) {
            sum += entry.getYear();
        }
        return (double) sum / carList.size();
    }

    public static String getType(int index) {
        List<String> typeList = Arrays.asList("sedan", "touring", "suv");
        return typeList.get(index);
    }
}
