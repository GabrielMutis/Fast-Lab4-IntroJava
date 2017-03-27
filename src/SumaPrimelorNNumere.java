/**
 * Created by mutis on 26.03.2017.
 */
public class SumaPrimelorNNumere {
    public static void main(String[] args) {
        int n, suma;
        n = SkeletonJava.readIntConsole("introduceti un numar: ");
        suma = 0;

        for(int i = 1; i <= n; i++){
            suma += i;
            System.out.print(i);
            if(i < n){
                System.out.print("+");
            }
        }
        System.out.print("=" + suma);
    }
}
