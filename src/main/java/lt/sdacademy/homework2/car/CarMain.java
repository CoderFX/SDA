package lt.sdacademy.homework2.car;

import java.time.Year;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CarMain {

    public static void main(String[] args) {
        Scanner stringScanner = new Scanner(System.in);
        List<Car> carList = new ArrayList<Car>();

        System.out.println("Suveskite automobilių duomenis atskiriant kabliataskiais");
        for (int i = 1; i <= 1; i++) {
            System.out.println("Automobilis Nr. " + i + ":");
            String model = "";
            double engine = 0.0;
            int year = 0;
            int price = 0;
            int type = 0;
            boolean doneInput = false;
            do {
                System.out.print("modelis: ");
                String inputText = stringScanner.nextLine();
                if (inputText.matches("\\s*\\w+.*")) {
                    doneInput = true;
                } else {
                    System.out.println("Įveskite tinkamą modelį");
                }
            } while (doneInput == false);

            doneInput = false;
            do {
                System.out.print("Variklio tūris dm3: ");
                String inputText = stringScanner.nextLine();
                inputText = inputText.replace(',', '.');
                if (inputText.matches("\\s*\\d+\\.?\\d*\\s*")) {
                    engine = Double.parseDouble(inputText.trim());
                    doneInput = true;
                } else {
                    System.out.println("Neteisingai įvesta, turi būti pvz.: \"2.2\" "+inputText);
                }
            } while (doneInput == false);

            doneInput = false;
            do {
                System.out.print("Pagaminimo metai: ");
                String inputText = stringScanner.nextLine();
                if (inputText.matches("\\s*\\d{4}\\s*")) {
                    year = Integer.parseInt(inputText.trim());
                    doneInput = true;
                } else {
                    System.out.println("Neteisingai įvesta, turi būti pvz.: \"2002\"");
                }
            } while (doneInput == false);

            doneInput = false;
            do {
                System.out.print("Kaina €");
                String inputText = stringScanner.nextLine();
                inputText = inputText.replace(',', '.');
                if (inputText.matches("\\s*\\d+\\.?\\d*\\s*")) {
                    price = Integer.parseInt(inputText.trim());
                    doneInput = true;
                } else {
                    System.out.println("Neteisingai įvesta, turi būti pvz.: \"1200\\");
                }
            } while (doneInput == false);

            doneInput = false;
            do {
                System.out.print("Tipas (0 - sedanas/ 1 - touring/ 2 - suv): ");
                String inputText = stringScanner.nextLine();
                if (inputText.matches("\\s*\\d+\\s*")) {
                    type = Integer.parseInt(inputText.trim());
                    doneInput = true;
                } else {
                    System.out.println("Neteisingai įvesta, turi būti pvz.: \"1\"; arba \"0\";;");
                }
            } while (doneInput == false);

            carList.add(new Car(model, engine, year, price, getType(type)));
        }

        Car newestCar = findNewestCar(carList);
        System.out.println("Naujausias auto: "+newestCar.getModel()+" - "+newestCar.getYear());

        double yearAverage = findYearAverage(carList);
        System.out.println("Metų vidurkis: "+yearAverage);

        Car mostExpensiveCar = findMostExpensive(carList);
        System.out.println("Brangiausias auto: "+newestCar.getModel()+" - "+newestCar.getPrice());

    }

    public static Car findNewestCar(List<Car> carList){
        Car newestCar = carList.get(0);
        for (Car candidate : carList){
            if (newestCar.getYear() < candidate.getYear()){
                newestCar = candidate;
            }
        }
        return newestCar;
    }

    public static Car findMostExpensive(List<Car> carList){
        Car mostExpensiveCar = carList.get(0);
        for (Car candidate : carList){
            if (mostExpensiveCar.getPrice() < candidate.getPrice()){
                mostExpensiveCar = candidate;
            }
        }
        return mostExpensiveCar;
    }

    public static double findYearAverage(List<Car> carList){
        int sum =0;
        for(Car entry : carList){
            sum += entry.getYear();
        }
        return (double) sum / carList.size();
    }

    public static String getType(int index) {
        List<String> typeList = Arrays.asList("sedan", "touring", "suv");
        return typeList.get(index);
    }
}
