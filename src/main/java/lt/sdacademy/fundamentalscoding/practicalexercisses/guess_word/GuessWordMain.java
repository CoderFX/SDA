package lt.sdacademy.fundamentalscoding.practicalexercisses.guess_word;

import java.util.Arrays;
import java.util.Scanner;

public class GuessWordMain {
    private static final String WORD = "xxl";

    public static void main(String[] args){
        char[] letterArray = WORD.toUpperCase().toCharArray();
        char[] hiddenArray = new char[letterArray.length];
        Arrays.fill(hiddenArray,'_');
        int trycount = 1;

        System.out.println("Žodis iš " + WORD.length() +" raidžių");
        while(true){
            String input = userInput();
            if(input.length() == 1){
                hiddenArray = check(input, hiddenArray, letterArray);
                System.out.println("Bandymas "+trycount);
                System.out.println(hiddenArray);
                if (Arrays.equals(hiddenArray,letterArray)) {
                    System.out.printf("Sveikinu! atspėjai iš %s kartų", trycount);
                    break;
                }
            }else{
                if (input.equals(WORD.toUpperCase())) {
                    System.out.printf("SVEIKINU! atspėjai iš %s kartų", trycount);
                    break;
                }
            }
            trycount++;
        }
    }

    public static String userInput(){
        Scanner input = new Scanner(System.in);
        System.out.println("Įveskite raidę arba žodį");
        return input.nextLine().toUpperCase();
    }

    public static char[] check(String input, char[] hiddenArray, char[] letterArray){
        char inputChar = input.toUpperCase().toCharArray()[0];
        for(int i=0; i < letterArray.length; i++){
            if(inputChar == letterArray[i]){
                hiddenArray[i] = inputChar;
            }
        }
        return hiddenArray;
    }
}