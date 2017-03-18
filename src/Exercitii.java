/**
 * Created by mutis on 18.03.2017.
 */
public class Exercitii {

    public static void main(String[] args){

        int nr;
        nr = SkeletonJava.readIntGUI("introduceti un numar:");

        if(nr >= 0){
            int pow = nr * nr;
            SkeletonJava.printGUI("patratul numarului " + nr + " este: " + pow);
        }
        else{
            SkeletonJava.printGUI("numarul " + nr + " este negativ");
        }
    }
}
