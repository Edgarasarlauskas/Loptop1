package introduction.hw;

import java.util.Scanner;

public class Calculation {

    public static void calc(double number1, double number2) {


    Scanner scanner = new Scanner(System.in);


        double answer =0;
        System.out.println("Iveskite veiksma, jei norite stabdyti programa, iveskite zodi stop");
        while (true) {

            String entry = scanner.nextLine();

            if (entry.equals("*")) {
                answer = number1 * number2;
                break;
            } else if (entry.equals( "/")) {
                answer = number1 / number2;
                break;
            } else if (entry.equals("-")) {
                answer = number1 - number2;
                break;

            } else if (entry.equals("+")) {
                answer = number1 + number2;
                break;
            } else if (entry.equalsIgnoreCase("stop")) {
                System.out.println("programa baigia darba");
                break;
            } else {
                System.out.println("veiksmas nerastas, is naujo iveskite veiksma");
            }

        }
        System.out.println("jusu gautas rezultatas: " +answer);
    }
}






