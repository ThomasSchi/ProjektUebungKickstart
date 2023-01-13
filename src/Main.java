import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner eingabe = new Scanner(System.in);
        double x,y;
        String operator;

        System.out.print("Bitte geben Sie Ihre erste Zahl ein: ");
        x=eingabe.nextDouble();

        System.out.print("Bitte geben Sie Ihren Operator ein: ");
        operator=eingabe.next();

        System.out.print("Bitte geben Sie Ihre zweite Zahl ein: ");
        y=eingabe.nextDouble();

        eingabe.close();

        double result = 0;

        switch(operator){
            case "+":
                percentagesquare.addition(x,y);
                break;
            case "-":
                percentagesquare.subtraktion(x,y);
                break;
            case"*":
                percentagesquare.multiplikation(x,y);
                break;
            case"/":
                percentagesquare.division(x,y);
                break;
            case"w":
                percentagesquare.squareroot(x);
            case"p":
                percentagesquare.percentage(x,y);
            default:
                System.out.print("Falscher Operator. Bitte Neueingabe.");
                return;

            }

        }
    }


