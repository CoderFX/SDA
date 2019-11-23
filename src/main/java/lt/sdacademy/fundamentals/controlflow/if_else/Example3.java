package lt.sdacademy.fundamentals.controlflow.if_else;

public class Example3 {
    public static void main(String[] args) {
        int age = 35;
        if (age < 18) {
            System.out.println("Tu paauglys");
        } else if(age > 100){
            System.out.println("Tu labai senas");
        } else {
            System.out.println("Tu suauges");
        }
    }
}
