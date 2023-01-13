import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double x;
        double y;
        System.out.println(summe(2, 6));
        System.out.println(subtraktion(6,7));


    }

    public static double summe(double x, double y) {
        return x + y;

    }

    public static double subtraktion(double x, double y) {
        return x-y;



    public static void mal(double x, double y){
        double ergebnis = x * y;
        System.out.println(x+" * "+y+ " = "+ ergebnis);
    }
    public static void geteilt(double x, double y){
        double ergebnis = x/y;
        System.out.println(x+" / "+" = "+ergebnis);
    }
}
