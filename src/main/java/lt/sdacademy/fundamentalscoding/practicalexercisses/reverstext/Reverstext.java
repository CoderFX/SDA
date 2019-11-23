package lt.sdacademy.fundamentalscoding.practicalexercisses.reverstext;

import java.util.Scanner;

public class Reverstext {
    public static void main(String[] args){
        Scanner textScanner = new Scanner(System.in);
        String text;
        String reverseText = "";
        System.out.println("Ivestite teksta");
        text = textScanner.nextLine();

        for(int i = text.length()-1; i>=0; i--){
            reverseText += text.charAt(i);
        }
        System.out.println(reverseText);
    }
}
