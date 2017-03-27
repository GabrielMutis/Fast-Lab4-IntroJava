/**
 * Created by mutis on 25.03.2017.
 */
public class Metode {
    public static void main(String[] args) {
        /*String lowC;
        lowC = SkeletonJava.readStringConsole("introduceti un string: ");
        System.out.println(lowC.toUpperCase());
        */

        String cale ="c:\temp.jpg\tt\fisier.txt";


        //int delacat = cale.indexOf(".");
        int delacat = cale.lastIndexOf(".");
        String extensie = cale.substring(delacat);
        System.out.println(extensie);
    }
}
