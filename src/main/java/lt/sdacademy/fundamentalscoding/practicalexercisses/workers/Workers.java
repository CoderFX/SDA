package lt.sdacademy.fundamentalscoding.practicalexercisses.workers;

public class Workers {
    private String name;
    private double salary;
    private int age;
    private char gender;

    public Workers(String name, double salary, int age, char gender){
        this.name = name;
        this.salary = salary;
        this.age = age;
        this.gender = gender;
    }

    public double getSalary(){return salary;}
    public int getAge(){return age;}
    public String getName(){return name;}
}
