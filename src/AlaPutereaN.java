/**
 * Created by mutis on 26.03.2017.
 */
public class AlaPutereaN {
    public static void main(String[] args) {
        int nr, putere, p;
        nr = SkeletonJava.readIntConsole("introduceti un numar: ");
        putere = SkeletonJava.readIntConsole("introduceti o putere: ");
        p = 1;

        for(int i = 1; i <= putere; i++){
            p *= nr;
            System.out.print(nr);
            if(i < putere){
                System.out.print("*");
            }
        }
        System.out.print("=" + p);
    }
}
