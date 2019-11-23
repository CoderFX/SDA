package lt.sdacademy.homework1;

import jdk.nashorn.internal.ir.WhileNode;

import java.util.Scanner;

public class antras_pirminis {
    public static void main(String[] args) {
        Scanner actionScanner = new Scanner(System.in);
        for(;;) {
            System.out.println("\r\nĮveskite sveiką skaičių (max 14 skaitmenų) arba \"N\" jei norite baigti");
            System.out.println("---------------------------------------------------------------------");
            String input = actionScanner.nextLine();
            if (input.toLowerCase().equals("n")) {
                System.out.println("Iki...");
                break;
            } else if (input.matches("[0-9]+")) {
                long isPrime = new Long (input);
                if (isPrime <= 99999999999999L) {
                    long start = System.currentTimeMillis(), working = System.currentTimeMillis();
                    int lastDigit = (int) (isPrime % 10);
                    if (isPrime > 1) {
                        if (isPrime == 2 || isPrime == 5) {
                            System.out.println("PIRMINIS!!!");
                        } else if (lastDigit != 5 && (lastDigit % 2) != 0) {
                            double quotient = 4.0, fPart;
                            long divider = 3, intPart, cycles = 0;
                            boolean prime = true;
                            while (quotient > divider) {
                                quotient = (double) isPrime / divider;
                                fPart = quotient % 1;
                                cycles++;
                                if (fPart == 0.0) {
                                    System.out.println("SUDĖTINIS, dauginamieji: " + divider + " ir " + (long) quotient);
                                    System.out.println("Atlikta " + cycles + " patikrinimų.");
                                    prime = false;
                                    break;
                                } else {
                                    divider += 2;
                                }
                            }
                            if (prime) {
                                System.out.println("PIRMINIS!!!");
                                System.out.println("Atlikta " + cycles + " patikrinimu.");
                            }
                        } else {
                            System.out.println("SUDĖTINIS");
                        }
                    }

                    System.out.println("paieška užtruko " + ((double) ((long) System.currentTimeMillis() - start) / 1000) + "s");
                }else{
                    System.out.println("Didžiausias skaičius gali buti is 14 skaitmenų");
                }

            } else {
                System.out.println("Įvedėte ne skaičių");
            }
        }
    }
}
