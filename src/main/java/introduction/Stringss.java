package introduction;

public class Stringss {

    public static void printHellowrd(String name, String lastname, int age) {
        String initialtext = "zdarova";
        System.out.println("prunt my neim   " + initialtext + " " + name + " " + lastname + " " + age);

    }

    public static void printStringpatters() {                 //sout
        System.out.println("basic pattern");

        System.out.println(" J   a   v   vv     a  ");
        System.out.println("  J a a   v  v    a a");
        System.out.println("J   J  aaaa v   aaaaa" );
        System.out.println("            v    a       a");

    }
    public static void printlowercase (String line,String lines){
        System.out.println("****************************");
        System.out.println("tolower case " + line.toLowerCase());
        System.out.println("to upper case "+ lines.toUpperCase());

    }

    public static void checkUserName(String username){
        if(username.length() > 5){
            System.out.println("tinka");}
            else {
                System.out.println("username per trumpas");
            }
        }



        public  static  void printReverse(String eilute){

            System.out.println("p rev string "+eilute);
            //String builder papildoma klase for eilutes
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(eilute);
            stringBuilder.reverse();
            System.out.println(stringBuilder);
            System.out.println(stringBuilder.toString());
        }

        public static void  printHalfOfTheString(String eilute){
            System.out.println("*******************");
            System.out.println("zdrf kaip tu seni?");
            int eilutesIlgis = eilute.length();
            int halfIlgis = eilutesIlgis /2;
            String puseEil = eilute.substring(0,halfIlgis);
            System.out.println(puseEil);




        }



        public static void printWordWithoutFirstLetter(String line){
            System.out.println("*************************8*******");
            System.out.println("pilnas zodis - " + line);
            int eilutesIlgis = line.length();
            String nukirptaEilute = line.substring(1, eilutesIlgis);
            System.out.println("nukirpta eilute = "+ nukirptaEilute);





        }
public static void compareTwoStrings (String pirmasZodis, String antrasZodis){
        //tolroma ar eilites lygios
    if(pirmasZodis.equals(antrasZodis)){
        System.out.println("zodziai lygus!");}
    else {
        System.out.println("zodziai nelygus");
    }





}
public static void printSymbolCount(String line){
    int lettersCount = 0;
    int spacesCount = 0;
    int numberCount = 0;
    int others = 0;


    for(int i = 0; i < line.length(); i++){
        String vienasSimbolis = line.substring(i,i+1);

        if(vienasSimbolis.matches("[a-zA-Z]")){
            lettersCount++;
        continue;}

        if(vienasSimbolis.matches(" ")){
                spacesCount = spacesCount +1 ;
        continue;}

        if(vienasSimbolis.matches("[0-9]")){
                numberCount = numberCount +1;
        continue;}

                else {
                    others++; }
    }

        System.out.println("raides " + lettersCount);
        System.out.println("tarpai "+ spacesCount);
        System.out.println("skaiciai "+ numberCount);
        System.out.println("kiti " + others);


        }

    }





