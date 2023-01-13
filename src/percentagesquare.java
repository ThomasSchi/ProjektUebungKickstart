
public class percentagesquare {

    public static void percentage(double x, double y) {
        //Berechnung des Prozentanteils von x zu y
        double ergebnis = (x * 100) / y;
        //Gibt Prozentanteil auf Konsole aus
        System.out.println(x + " von " + y + " = " + ergebnis + "%");
    }


    public static void addition(double x, double y) {
        //Berechnung der Addition von x und y
        double ergebnis = x + y;
        //Gibt Ergebnis der Addition auf Konsole aus
        System.out.println(x + " + " + y + " = " + ergebnis);
        }

    public static void subtraktion(double x, double y) {
        //Berechnung der Subtraktion von x und y
        double ergebnis = x - y;
        //Gibt Ergebnis der Subtraktion auf Konsole aus
        System.out.println(x + " - " + y + " = " + ergebnis);
        }

        public static void multiplikation( double x, double y){
            //Berechnung der Multiplikation von x und y
            double ergebnis = x * y;
            //Gibt Ergebnis der Multiplikation auf Konsole aus
            System.out.println(x + " * " + y + " = " + ergebnis);
        }

        public static void division( double x, double y){
            //Berechnung der Division von x und y
            double ergebnis = x / y;
            //Gibt Ergebnis der Division auf Konsole aus
            System.out.println(x + " / " + y + " = " + ergebnis);
        }

        public static void rest(double x, double y) {
            //Berechnung des Rests bei Division von x und y
            double ergebnis = x%y;
            //Gibt das Ergebnis der Division auf der Konsole aus
            System.out.println("Der Rest bei Division von " + x + " und " + y + " = " + ergebnis);
        }
    }

