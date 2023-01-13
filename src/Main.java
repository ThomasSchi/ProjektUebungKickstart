import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double x;
        double y;
        System.out.println(summe(2, 6));
        System.out.println(subtraktion(6,7));


        System.out.println("hello group");

    public static double summe(double x, double y) {
        return x + y;

    }

    public static double subtraktion(double x, double y) {
        return x-y;



    }
}

        public static void percentage(double x, double y) {

            double ergebnis = (x*100)/y;
            System.out.println(x + " von " + y + " = " + ergebnis +"%");
        }

        public static void squareroot(double x) {
            double ergebnis = Math.sqrt(x);
            System.out.println("Die Wurzel von " + x + " = " + ergebnis );

        }
    }
