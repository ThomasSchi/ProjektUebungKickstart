import java.util.Scanner;

//Thomas --> Project Lead
//Nadine & Amira --> Java Meister mit Prüfzeichen
// Khoi --> Time Manager
public class Main {
    public static void main(String[] args) {
        // Scanner erstellt und benannt
        Scanner eingabe = new Scanner(System.in);
        // Double-Variablen X und Y  initialisiert
        double x, y;
        // String Operator initialisiert
        String operator;


        // Printed "Bitte geben Sie Ihre erste Zahl ein: " auf die Konsole
        System.out.print("Bitte geben Sie Ihre erste Zahl ein: ");
        x = eingabe.nextDouble();

        // Printed "Bitte geben Sie Ihren Operator ein: " auf die Konsole
        System.out.print("Bitte geben Sie Ihren Operator ein: ");
        operator = eingabe.next();
        //// Printed "Bitte geben Sie Ihre zweite Zahl ein: "auf die Konsole

        System.out.print("Bitte geben Sie Ihre zweite Zahl ein: ");
            y = eingabe.nextDouble();

            eingabe.close();

            double result = 0;

            switch (operator) {
                case "+":
                    // Ruft die Methode Addition auf
                    percentagesquare.addition(x, y);
                    break;
                case "-":
                    // Ruft die Methode Subtraktion auf
                    percentagesquare.subtraktion(x, y);
                    break;
                case "*":
                    // Ruft die Methode Multiplikation auf
                    percentagesquare.multiplikation(x, y);
                    break;
                case "/":
                    // Ruft die Methode Division auf
                    percentagesquare.division(x, y);
                    break;
                case "p":
                    // Ruft die Methode Percentage auf
                    percentagesquare.percentage(x, y);
                    break;
                case "r":
                    // Ruft die Methode Rest auf
                    percentagesquare.rest(x, y);
                    break;
                default:
                    // Bei falscher Eingabe Printed "Falscher Operator. Bitte Neueingabe." auf die Konsole
                    System.out.print("Falscher Operator. Bitte Neueingabe.");
                    return;

            }

        }
    }



