package lt.sdacademy.person;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Jusu vardas: ");
        String name = input.nextLine();

        System.out.println("Jusu amzius: ");
        String age = input.nextLine();

        System.out.println("Jusu ugis: ");
        String tall = input.nextLine();

        System.out.println("Vardas: " + name);
        System.out.println("Amzius : " + age);
        System.out.println("Ugis: " + tall);

    }
}
