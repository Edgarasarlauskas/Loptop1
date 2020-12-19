package introduction.hw;

import java.util.Scanner;

public class ArrayIntScanner {

    public static void scanIntArray() {

        Scanner scanner = new Scanner(System.in);

        int suma = 0;
        System.out.println("iveskite elementu kieki");
        int elem = scanner.nextInt();
        // Kaip padaryti, kad galeciau keisti masyvo dydi cikle
        int[] sum = {23,124,124,15,125,1244,125,125};
        System.out.printf("iveskite %d elementu/us ", elem);

        for (int i = 0; i < elem; i++) {

            System.out.printf("iveskite %d elemnta:", i+1);
            sum[i] = scanner.nextInt();

       //     System.out.println(sum[i]);
           suma = suma + sum[i];

        }

        System.out.println(suma);

    }
}


