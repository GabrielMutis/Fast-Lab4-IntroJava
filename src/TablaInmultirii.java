import java.rmi.server.Skeleton;

/**
 * Created by mutis on 18.03.2017.
 */
public class TablaInmultirii {
    public static void main(String[] args){
        int nr; //numar introdus de la tastatura
        nr = SkeletonJava.readIntGUI("Introduceti un numar:");
        int a = 0; //numarul la care vom inmulti nr
        while (a < 10){
            int rez = nr * a;
            SkeletonJava.printConsole("rezultatule inmultirii " + nr + " * " + a + " = " + rez);
            a++;
        }
    }
}
