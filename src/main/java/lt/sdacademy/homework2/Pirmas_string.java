package lt.sdacademy.homework2;

public class Pirmas_string {
    public static void main(String[] args) {
        String text = "Ad Astra Per Aspera";

        System.out.println("a)" + text.toLowerCase());
        System.out.println("b)" + text.toUpperCase());
        System.out.println("c)" + text.replace("A", "X"));
        System.out.println("d)" +text.matches("Ad.*"));
    }
}
