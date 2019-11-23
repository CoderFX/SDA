package lt.sdacademy.homework1;

import java.util.Scanner;

public class penktas_savaitesD {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Įveskite savaitės dieną žodžiu:");
        String dayOfWeek = inputScanner.next();
        switch (dayOfWeek.toLowerCase()) {
            case "pirmadienis": {
                System.out.println(dayOfWeek + " => 1");
                break;
            }
            case "antradienis": {
                System.out.println(dayOfWeek + " => 2");
                break;
            }
            case "treciadienis":
            case "trečiadienis": {
                System.out.println(dayOfWeek + " => 3");
                break;
            }
            case "ketvirtadienis": {
                System.out.println(dayOfWeek + " => 4");
                break;
            }
            case "penktadienis": {
                System.out.println(dayOfWeek + " => 5");
                break;
            }
            case "sestadienis":
            case "šeštadienis": {
                System.out.println(dayOfWeek + " => 6");
                break;
            }
            case "sekmadienis": {
                System.out.println(dayOfWeek + " => 7");
                break;
            }
            default: System.out.println("Kad ne savaitės dieną įvedei, nieko neišvesiu");
        }
    }
}
