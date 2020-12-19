package introduction.hw;
import java.util.Scanner;
public class Scener {



    public static double getFirstNumber() {

        double entry;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite 1-aji elementa");
        entry = scanner.nextDouble();

        System.out.println(entry);

        return entry;

    }

    public static double getSecondsNumber(){

        double entry;
                Scanner scanner = new Scanner(System.in);
        System.out.println("iveskite 2-aji elementa");
        entry = scanner.nextDouble();

        System.out.println(entry);

        return entry;

    }
}

