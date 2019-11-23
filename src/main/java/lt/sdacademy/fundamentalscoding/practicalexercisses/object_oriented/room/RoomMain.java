package lt.sdacademy.fundamentalscoding.practicalexercisses.object_oriented.room;

import java.util.Scanner;

public class RoomMain {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Iveskite kamb. ploti: ");
        int inputWidth = userInput.nextInt();

        System.out.println("Iveskite kamb. ilgi: ");
        int inputLength = userInput.nextInt();

        Room room = new Room(inputWidth, inputLength);

        int square = getSquareOfRoom(room.getLength(), room.getWidth());
        System.out.println("Plotas: " + square);
    }

    private static int getSquareOfRoom(int length, int width) {
        return (length * width);
    }
}
