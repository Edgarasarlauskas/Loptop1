package introduction;

import java.sql.SQLOutput;

public class dataTypes
{
    public static void printSum(int firstNumber, int secondNumber, int thirdNumber){

        int suma = firstNumber + secondNumber +thirdNumber;
        System.out.printf("%d +%d +%d  = %d",firstNumber,secondNumber,thirdNumber,suma);
        System.out.println(suma);

    }

    public static void printDivision(int daliklis, int skaitiklis){
        int rez = daliklis/skaitiklis;
        int liekana = daliklis % skaitiklis;

        System.out.printf("%d / %d = %d  ",daliklis,skaitiklis,rez);
        System.out.printf("%d / %d liekana = %d",daliklis,skaitiklis,liekana);

    }

}
