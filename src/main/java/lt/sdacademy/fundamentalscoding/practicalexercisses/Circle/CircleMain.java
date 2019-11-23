package lt.sdacademy.fundamentalscoding.practicalexercisses.Circle;

import java.util.Scanner;
public class CircleMain {
    public static void main(String[] args){
        Scanner inputNum = new Scanner(System.in);
        Scanner inputString = new Scanner(System.in);

        System.out.print("Iveskite Spinduli: ");
        int radius = inputNum.nextInt();

        System.out.print("Iveskite Spalva: ");
        String color = inputString.nextLine();

        Circle myCircle = new Circle(radius, color);

        System.out.printf("Apskritimo plotas = %.2f \r\n", countCircleSquare(myCircle.getRadius()));
        System.out.println("Apskritimo spalva = "+myCircle.getColor());
    }

    private static double countCircleSquare(int radius){
        return Math.pow(radius, 2) * Math.PI;
    }
}
