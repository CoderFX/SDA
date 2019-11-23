package lt.sdacademy.homework1;

import java.security.PublicKey;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class trecias_koordinates {
    public static void main(String[] args){
        Map<String, String> answersMap = new HashMap<>();
        //-------(minus x minus y)-----
        answersMap.put("0000", "koordinačių pradžioje");
        answersMap.put("0001", "ant teigiamos Y ašies");
        answersMap.put("0101", "pirmame ketvirtyje");
        answersMap.put("0100", "ant teigiamos X ašies");
        answersMap.put("0111", "antrame ketvirtyje");
        answersMap.put("0011", "ant neigiamos Y ašies");
        answersMap.put("1111", "trečiame ketvirtyje");
        answersMap.put("1100", "ant neigiamos X ašies");
        answersMap.put("1101", "ketvirtame ketvirtyje");

        Scanner lineScanner = new Scanner(System.in);
        for(;;) {
            System.out.println("Įveskite taško koordinates X ir Y atskiriant tarpu. Arba \"N\", kad baigti");
            String input = lineScanner.nextLine();
            if(input.toLowerCase().equals("n")){
                System.out.println("Iki...");
                break;
            } else if(input.matches("\\-?\\d+ \\-?\\d+")){
                String pattern = "";
                String[] koordinates = input.split(" ", 2);
                for (String i: koordinates) {
                    int j = Integer.parseInt(i);
                    if( j>0){
                        pattern += "01";
                    } else if(j<0){
                        pattern += "11";
                    } else pattern += "00";
                }
                System.out.println("Taškas yra "+answersMap.get(pattern));
                System.out.println("-------------------------------------------------");
            } else {
                System.out.println("Įvestos koordinatės nesuprantamos");
            }

        }
    }
}