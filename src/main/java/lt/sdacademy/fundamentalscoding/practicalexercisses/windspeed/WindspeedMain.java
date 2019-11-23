package lt.sdacademy.fundamentalscoding.practicalexercisses.windspeed;

import java.util.Scanner;

public class WindspeedMain {

    private static final double NAUTIC_MILE = 1.852;
    private static final double BEAUFORT_CONSTANT = 3.01;

    public static void main(String [] args) {
        Scanner windInput = new Scanner(System.in);

        System.out.println("Ivesk vejo greiti km");
        int kmph = windInput.nextInt();

        System.out.println("Greitis mazgais yra: " + (kmph * NAUTIC_MILE));
        System.out.println("Vejo greitis beuforto skaleje yra: " + Math.pow(kmph / BEAUFORT_CONSTANT, 1.5));
        System.out.println("Vėjo stiprumas yra: " + (kmph <= 20 ? "ramus" : "stiprus"));
    }
}
