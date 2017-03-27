/**
 * Created by mutis on 26.03.2017.
 */
public class SumaIntre4Si9 {
    public static void main(String[] args) {
        int nr, suma;
        suma = 0;

        do{
            nr =SkeletonJava.readIntConsole("introduceti un numar: ");
            if(nr > 4 && nr < 11){
                suma += nr;
            }
        }
        while(nr != 0);
        if(suma != 0){
            System.out.println("Suma este: " + suma);
        }
        else{
            System.out.println("Program terminat");
        }
    }
}
