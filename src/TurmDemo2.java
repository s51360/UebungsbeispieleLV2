import java.util.Scanner;

public class TurmDemo2 {
    public static void main(String[] args) {
        getTowerCalculator(0);
    }

    public static void getTowerCalculator(int zahl) {
        // int zahl;
        int result;

        System.out.println("Geben Sie die gewünschte Zahl ein.");
        Scanner scanner = new Scanner(System.in);
        zahl = scanner.nextInt();
        result = zahl;

        int counter = 2;
        while (counter <= 9) {
            zahl = result;
            result = zahl * counter;
            System.out.println(zahl + " * " + counter + " = " + result);
            counter++;
        }
    }
}