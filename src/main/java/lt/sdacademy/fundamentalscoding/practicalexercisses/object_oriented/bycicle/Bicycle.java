package lt.sdacademy.fundamentalscoding.practicalexercisses.object_oriented.bycicle;

public class Bicycle {
    private int model;
    private int gear;
    private int speed;
    static int count = 0;

    public Bicycle(int model, int gear, int speed){
        this.model = model;
        this.gear = gear;
        this.speed = speed;
        count++;
    }

    public int getModel(){
        return model;
    }

    public static  int getCount(){
        return count;
    }
}
