package introduction;

public class loops {
    public static void printMultiprication(int number){
        System.out.printf("nummber %d",number);

        for(int skaicius=0;skaicius< 10  ; skaicius ++){
            System.out.println((number*skaicius + " "));
        }

    }
    public static void printFactorial(int givenNumber){
        int factorial = 1;
        for(int i = 1; i<= givenNumber; i++){
            factorial = factorial *i ;}
            System.out.printf("factorial of %d is : %d \n ",givenNumber,factorial);
        }
    }

