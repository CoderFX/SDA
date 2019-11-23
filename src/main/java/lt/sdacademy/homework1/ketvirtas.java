package lt.sdacademy.homework1;

import javax.swing.*;
import java.util.Scanner;

public class ketvirtas {
    public static void main(String[] args){
        Scanner lineScanner = new Scanner(System.in);
        for(;;) {
            System.out.println("Įveskite skaičių iki 100 arba \"N\" jei norite baigti");
            String input = lineScanner.nextLine();
            double number;
            String divisible = "";
            int count = 0;
            if (input.toLowerCase().equals("n")) {
                System.out.println("ate...");
                break;
            }
            if (input.matches("[\\d]+[\\.\\,]?[\\d]*")) {
                if (input.contains(",")) {
                    input = input.replace(",", ".");
                }
                number = Double.parseDouble(input);
                if (number <= 100) {
                    for (int i = (int) number; i <= 100; i++) {
                        if (((double) i / number) % 1 == 0.0) {
                            divisible += i + ", ";
                            count++;
                        }
                    }
                    if (count > 0) {
                        System.out.println("Is (" + number + ") dalinasi " + count + " skaičiai iki 100");
                        System.out.println("( " + divisible + " )");
                    } else {
                        System.out.println("Is (" + input + ") nesidalina nei vienas skaičius iki 100");
                    }
                } else {
                    System.out.println("Per didelis skaičius");
                }
            } else {
                System.out.println("neteisingas skaičius");
            }
            System.out.println("---------------------------------------------------------------");
        }
    }
}
