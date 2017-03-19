/**
 * Created by mutis on 19.03.2017.
 */
public class MaPanaIntalneste0 {
    public static void main(String[] args){
        float nr, suma;
        suma = 0;
        int i;
        i = 0;
        do{
            nr = SkeletonJava.readIntGUI("Introduceti un numar:");
            suma += nr;
            if(nr != 0) {
                i++; //daca numarul introdus este 0 (zero) nu dorim sa mai incrementam
            }
        }
        while(nr != 0);
        float ma;
        ma = suma / i;
        SkeletonJava.printGUI("MediaAritmetica este: " + ma);
    }
}