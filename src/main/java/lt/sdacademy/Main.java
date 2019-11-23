package lt.sdacademy;

public class Main {
    public static void main(String[] args) {
        int[] masyvas = new int[2];
        masyvas[0] = 255;
        masyvas[1] = 123;

        for (int i = 0; i < 5; i = i + 1) {
            if (i < masyvas.length) {
                System.out.println(i + 1 + " sk= " + masyvas[i]);
            }
        }
    }
}