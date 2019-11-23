package lt.sdacademy.calculator;

import com.sun.xml.internal.ws.server.provider.ProviderInvokerTube;

import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args) {
        Scanner numberScanner = new Scanner(System.in);
        Scanner actionScanner = new Scanner(System.in);
        boolean calculate = true;
        while (calculate) {

            System.out.print("Ivesk pirma skaiciu: ");
            double firstNum = numberScanner.nextDouble();

            System.out.print("Ivesk antra skaiciu: ");
            double secondNum = numberScanner.nextDouble();

            System.out.print("koki veiksma atlikti + - * / ? ");
            String action = actionScanner.nextLine();

            switch (action) {
                case ("+"): {
                    System.out.println("REZULTATAS " + (firstNum + secondNum));
                    break;
                }
                case ("-"): {
                    System.out.println("REZULTATAS " + (firstNum - secondNum));
                    break;
                }
                case ("*"): {
                    System.out.println("REZULTATAS " + (firstNum * secondNum));
                    break;
                }
                case ("/"): {
                    System.out.println("REZULTATAS " + (firstNum / secondNum));
                    break;
                }
                default: {
                    System.out.println("\r\nNEZINOMAS VEIKSMAS :(");
                }

            }
            System.out.println();
            System.out.print("SKAICIUOSI DAR? t arba n :");
            String testi = actionScanner.nextLine();
            if (testi.toLowerCase().equals("n")){
                calculate = false;
            }

        }

    }
}
