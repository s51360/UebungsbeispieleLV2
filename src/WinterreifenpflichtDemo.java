public class WinterreifenpflichtDemo {
    public static void main(String[] args) {
        // System.out.println("Hello World!"); // erste Überprüfung ob die Umgebung lauffähig ist.

        boolean winterreifenPflicht = isWinterreifenPflicht(15, false);

        if (winterreifenPflicht == true) {
            System.out.println("Bitte Winterreifen verwenden");
        } else {
            System.out.println("Winterreifen sind nicht erforderlich");
        }
    }

    public static boolean isWinterreifenPflicht (double temperatur, boolean rutschigeFahrbahn) {
        boolean reifenPflicht;

        if ((temperatur < 10 && rutschigeFahrbahn == true) || temperatur < 4) {
            reifenPflicht = true;
        } else {
            reifenPflicht = false;
        }
        return reifenPflicht;
    }
}