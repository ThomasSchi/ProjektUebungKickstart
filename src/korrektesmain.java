import java.util.Scanner;
public class main1 {
    public static void main(String[] args) {
        Scanner eingabe = new Scanner(System.in);
        double zahleins;
        double zahlzwei;
        String operator;


        System.out.println("Bitte geben Sie Ihre erste Zahl ein");
        zahleins=eingabe.nextDouble();


        System.out.println("Bitte geben Sie Ihren Operator ein");
        operator=eingabe.next();


        System.out.println("Bitte geben Sie Ihre zweite Zahl ein");
        zahlzwei=eingabe.nextDouble();

        eingabe.close();
        double result = 0;


        switch(operator){
            case "+":
                result=zahleins+zahlzwei;
                break;
            case "-":
                result = zahleins-zahlzwei;
                break;
            case"*":
                result=zahleins*zahlzwei;
                break;
            case"/":
                result=zahleins/zahlzwei;
                break;
            default:
                System.out.print("Falscher Operator");
                return;



            }
             System.out.println("Ergebnis: "+result);



        }


    }


