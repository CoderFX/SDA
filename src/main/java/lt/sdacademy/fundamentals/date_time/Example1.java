package lt.sdacademy.fundamentals.date_time;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class Example1 {
    public static void main(String[] args){
        Date now = new Date();
        //arba
        long millis = System.currentTimeMillis();
        now = new Date(millis);
        System.out.println(now);

        Calendar cal = Calendar.getInstance();
        Date date = cal.getTime(); // konvertuojamas Calendar objektas i Date objekta
        System.out.println(date);

        cal.setTime(now); //konvertuojamas Date objektas i calendar objekta
        System.out.println(cal.get(Calendar.YEAR)); //2019
        System.out.println(cal.get(Calendar.DAY_OF_YEAR));
        System.out.println(cal.get(Calendar.WEEK_OF_YEAR));

        String dateInText = "2019-02-18";
        LocalDate localDate = LocalDate.parse(dateInText);
        System.out.println(localDate);
    }
}
