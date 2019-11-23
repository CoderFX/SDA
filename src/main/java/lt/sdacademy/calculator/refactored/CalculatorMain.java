package lt.sdacademy.calculator.refactored;

import com.sun.xml.internal.ws.server.provider.ProviderInvokerTube;

import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args) {
        Scanner actionScanner = new Scanner(System.in);
        boolean calculate = true;
        double result;

        while (calculate) {
            double firstNum = getNum("Ivesk pirma skaiciu: ");
            double secondNum = getNum("Ivesk antra skaiciu: ");
            System.out.print("koki veiksma atlikti + - * / ? ");
            String action = actionScanner.nextLine();

            result = getResult(action, firstNum, secondNum);
            System.out.println(result);

            System.out.print("SKAICIUOSI DAR? t arba n :");
            String testi = actionScanner.nextLine();
            if (testi.toLowerCase().equals("n")) {
                calculate = false;
            }
        }
    }

    private static double getNum(String message) {
        Scanner numberScanner = new Scanner(System.in);
        System.out.println(message);
        return numberScanner.nextDouble();
    }

    private static double getResult(String action, double num1, double num2) {
        switch (action) {
            case ("+"):
                return num1 + num2;
            case ("-"):
                return num1 - num2;
            case ("*"):
                return num1 * num2;
            case ("/"):
                return num1 / num2;
            default:
                System.out.println("veiksmas nezinomas");
                return 0;

        }
    }
}
