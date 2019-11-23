package lt.sdacademy.fundamentalscoding.practicalexercisses.windspeed.refactored;

import java.util.Scanner;

public class WindspeedMain {

    private static final double NAUTIC_MILE = 1.852;
    private static final double BEAUFORT_CONSTANT = 3.01;

    public static void main(String [] args) {
        Scanner windInput = new Scanner(System.in);

        System.out.println("Ivesk vejo greiti km");
        int kmph = windInput.nextInt();


        System.out.printf("Greitis mazgais yra: %.1f \r\n", kmphToNauticMile(kmph));
        System.out.printf("Vejo greitis beuforto skaleje yra: %.1f \r\n", kmphtobeufortscale(kmph));
        System.out.println("Vėjo stiprumas yra: "+ getWindStrength(kmph));
    }

    private static double kmphToNauticMile(int km){
        return km * NAUTIC_MILE;
    }
    private static double kmphtobeufortscale(int km){
        double beufort = Math.pow(km / BEAUFORT_CONSTANT, 1.5);
        return Math.min(beufort, 12);
    }
    private static String getWindStrength(int km){
        return km <= 20 ? "ramus" : "stiprus";
    }
}
