import java.util.Random;

/**
 * Created by mutis on 05.04.2017.
 */
public class NumGuess {
    public static void main(String[] args) {
        //generare numar
        //introducere numar de la tastatura
        //numar incercari
        //verificare numar generat cu cel introdus
        //afisare mesaj
        lucru();

    }

    public static int generareNr() {
        Random rn = new Random();
        int generate = rn.nextInt(10) + 1;
        System.out.println("S-a generat un numar intre 1 - 10, incearca sa il ghicesti");
        return generate;
    }

    public static void lucru() {
        int numarGenerat = generareNr();
        int numarTastatura, count;
        count = 0;
        do{
            numarTastatura = SkeletonJava.readIntConsole("Introduceti un numar: ");
            count++;
            if(numarTastatura > numarGenerat){
                System.out.println("introdu un numar mai mic de " + numarTastatura);
            }
            if(numarTastatura < numarGenerat){
                System.out.println("introdu un numar mai mare de " + numarTastatura);
            }
        }
        while(numarGenerat != numarTastatura);

        if(count == 1){
            System.out.println("felicitari ai ghicit din prima!");
        }
        else{
            System.out.println("bravo ai ghicit din " + count + " incercari!");
        }
    }
}
