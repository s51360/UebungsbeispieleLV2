public class TurmDemo {
    public static void main(String[] args) {
        long number = 2;
        long sum = number;

        /*
        for (int i = 2; i <= 9 ; i++) {
            number = sum;
            sum = sum * i; // oder number * i
            System.out.println(number + " * " + i + " = " + sum);
        }

        for (int i = 2; i <= 9; i++) {
            number = sum;
            sum = number / i;
            System.out.println(number + " : " + i + " = " + sum);
        }
        */

        int i = 2;

        while (i <= 9) {
            number = sum;
            sum = number * i;
            System.out.println(number + " * " + i + " = " + sum);
            i++;
        }

        int ii = 2;

        while (ii <= 9) {
            number = sum;
            sum = number / ii;
            System.out.println(number + " : " + ii + " = " + sum);
            ii++;
        }

    }
}