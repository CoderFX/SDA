package lt.sdacademy.fundamentalscoding.practicalexercisses.object_oriented.room;

public class Room {
    private int width;
    private int length;

    public Room(int width, int heigth){
        this.width = width;
        this.length = heigth;
    }

    public int getWidth(){
        return width;
    }

    public int getLength(){
        return length;
    }
}
