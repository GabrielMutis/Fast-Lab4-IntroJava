/**
 * Created by mutis on 27.03.2017.
 */
public class SumadinXlaN {
    public static void main(String[] args) {
        int nr, suma, putere, p;
        nr = SkeletonJava.readIntConsole("introduceti un numar: ");
        putere = SkeletonJava.readIntConsole("introduceti o putere: ");
        suma = 0;
        p = 1;

        for(int i = 1; i <= putere; i++){
            if(i == 1){
                System.out.print("1 + ");
            }
            p *= nr;
            for(int j = 1; j <= i; j++){
                System.out.print(nr);
                if(j < i){
                    System.out.print("*");
                }
            }
            if(i < putere){
                System.out.print(" + ");
            }
            suma += p;
        }
        suma += 1;
        System.out.print(" = " + suma);
    }
}
