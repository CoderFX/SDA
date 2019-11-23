package lt.sdacademy.homework1;

public class pirmas_1to100 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + ", ");
            if (i % 20 == 0) {
                System.out.println();
            }
        }
    }
}
