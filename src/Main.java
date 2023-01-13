import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        addieren(s);

    }

    public static void addieren(Scanner plus) {
        System.out.println("zahl zum addieren eingeben = ");
        int zahl1;
        zahl1 = plus.nextInt();
        System.out.println("zahl1=" + zahl1);

        System.out.println("zahl zum addieren eingeben = ");
        int zahl2;
        zahl2 = plus.nextInt();
        System.out.println("zahl2=" + zahl2);

        int summe = zahl1 + zahl2;

        System.out.println("summe=" + summe);

    }
}
