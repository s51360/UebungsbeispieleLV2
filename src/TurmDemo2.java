import java.util.Scanner;

public class TurmDemo2 {
    public static void main(String[] args) {
        getTowerCalculator(0);
    }

    public static void getTowerCalculator(int number) {
        // int number;
        int result;

        System.out.println("Geben Sie die gewünschte Zahl ein.");
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        result = number;

        int counter = 2;
        while (counter <= 9) {
            number = result;
            result = number * counter;
            System.out.println(number + " * " + counter + " = " + result);
            counter++;
        }
    }
}