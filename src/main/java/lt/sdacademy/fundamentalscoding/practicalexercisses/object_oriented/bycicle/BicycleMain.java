package lt.sdacademy.fundamentalscoding.practicalexercisses.object_oriented.bycicle;

import java.math.BigInteger;

public class BicycleMain {
    public static void main(String[] args){

    Bicycle bike = new Bicycle(75,2,20);

    bike.getModel();
    System.out.println(bike.getModel());

    int model = bike.getModel();
    System.out.println("Model is: "+ model);
    System.out.println(Bicycle.count);

    Bicycle anotherBike = new Bicycle(80, 4, 25);
    System.out.println(Bicycle.count);

    System.out.println(Bicycle.count == bike.count);
    System.out.println(bike.count == anotherBike.count);

    }
}