package lt.sdacademy.fundamentalscoding.practicalexercisses.factorial;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args){
        Scanner scanInteger = new Scanner(System.in);
        int faktorialas = 1;

        System.out.println("Iveskite sveika skaiciu");
        int factorialEnd = scanInteger.nextInt();
        for (int i = factorialEnd; i > 1; i--){
            faktorialas = faktorialas * i;
        }
        System.out.println("faktorialas yra "+faktorialas);

    }
}
