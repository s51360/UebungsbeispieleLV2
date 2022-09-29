public class NotenDemo {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello World!"); // erste Überprüfung ob die Umgebung lauffähig ist.

        String notentext = getNotentext(0);
        System.out.println("Die Note lautet: " + notentext);

        System.out.println("Die Note lautet: " + getNotentext(53));
        System.out.println("Die Note lautet: " + getNotentext(95));
        System.out.println("Die Note lautet: " + getNotentext(69));
        System.out.println("Die Note lautet: " + getNotentext(101)); // wie erwartet ein Exception
    }

    public static String getNotentext (int punkte) throws Exception {
        String note;

        if (punkte >= 90 && punkte <= 100) {
            note = "Sehr Gut";
        } else if (punkte >= 78 && punkte <= 89) {
            note = "Gut";
        } else if (punkte >= 65 && punkte <= 77) {
            note = "Befriedigend";
        } else if (punkte >= 51 && punkte <= 64) {
            note = "Genügend";
        } else if (punkte >= 0 && punkte <= 50) {
            note = "Ungenügend";
        } else {
            throw new Exception("ACHTUNG: Mehr als 100 oder weniger als 0 Punkte, Note kann nicht berechnet werden!");
            // man könnte auch in der Exception Gleitkommazahlen berücksichtigen ...
        }
        return note;
    }
}