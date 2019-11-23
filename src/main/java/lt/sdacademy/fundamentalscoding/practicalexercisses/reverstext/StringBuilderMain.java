package lt.sdacademy.fundamentalscoding.practicalexercisses.reverstext;

import java.util.Scanner;

public class StringBuilderMain {
    public static void main(String[] args){
        StringBuilder stringBuilder = new StringBuilder();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ivesk txt");
        stringBuilder.append(scanner.nextLine());
        stringBuilder.reverse();

        System.out.println(stringBuilder);
    }
}
