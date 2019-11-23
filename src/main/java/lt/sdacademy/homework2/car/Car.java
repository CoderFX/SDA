package lt.sdacademy.homework2.car;

import java.time.Year;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Car {
    String model;
    double engine;
    int year;
    int price;
    String type;

    public Car(String model, double engine, int year, int price, String type){
        this.model = model;
        this.engine = engine;
        this.year = year;
        this.price = price;
        this.type = type;
    }

    public String getModel(){
        return model;
    }
    public int getYear(){
        return year;
    }
    public int getPrice(){
        return price;
    }
}