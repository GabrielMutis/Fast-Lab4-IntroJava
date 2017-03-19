/**
 * Created by mutis on 19.03.2017.
 */
public class MaDintreNnumere {
    public static void main(String[] args){
        int nr;
        nr = SkeletonJava.readIntGUI("Specificati cate numere doriti sa introduceti:");
        if(nr > 0){
            float suma;
            suma = 0;   //suma rep suma numerelor introduse de la tastatura
            float i;
            i = 0;  //i rep. numitorul la care dorim sa impartim suma numerelor
            while(i < nr) {
                float nrIntrodus;
                nrIntrodus = SkeletonJava.readIntGUI("Introduceti o valoare:");
                suma += nrIntrodus;
                i++;
            }
            float ma;
            ma = suma / i;
            SkeletonJava.printGUI("Media aritmetica a numerelor introduse este: " + ma);
        }
        else{
            SkeletonJava.readStringConsole("un numar prea mic a fost introdus!");
        }
    }
}
