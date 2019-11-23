package lt.sdacademy.fundamentals.controlflow.swich_case;

public class Example1 {
    public static void main(String[] args){
        char direction = 'w';

        switch (direction){
            case 'n':
                System.out.println("Siaures kryptis");
                break;
            case 's':
                System.out.println("Pietu kryptis");
                break;
            case 'e':
                System.out.println("Rytu kryptis");
                break;
            case 'w':
                System.out.println("Vakaru kryptis");
                break;
            default:
                System.out.println("Nezinoma kryptis");
        }
    }
}
