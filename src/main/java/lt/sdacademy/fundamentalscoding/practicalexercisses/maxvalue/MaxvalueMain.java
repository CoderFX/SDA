package lt.sdacademy.fundamentalscoding.practicalexercisses.maxvalue;

import java.util.Scanner;

public class MaxvalueMain {
    public static void main(String[] args){
        Scanner numLine = new Scanner(System.in);

        System.out.println("Ivesk skaicius per kableli");
        String userInput = numLine.nextLine().replaceAll("!\\,!\\d", "");
        String[] numArray = userInput.split(",");

        int max = Integer.parseInt(numArray[0]);
        for (String i: numArray){
            int maxCandidate = Integer.parseInt(i);
            if (maxCandidate > max) {
                max = maxCandidate;
            }
        }

        System.out.println("Didziausias yra "+max);
    }
}
