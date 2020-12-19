package introduction.hw;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
     //   Scener scuner = new Scener();
        double nr1;
        double nr2;
        Calculation calculation = new Calculation();
        Scanner scanner = new Scanner(System.in);

      nr1 =Scener.getFirstNumber();
      nr2 =Scener.getSecondsNumber();

      Calculation.calc(nr1,nr2);

      ArrayIntScanner.scanIntArray();

    }
}

