/**
 * Created by mutis on 20.03.2017.
 */
public class ArrayInput {
    public static void main(String[] args){
        int x;
        x = SkeletonJava.readIntGUI("Introduceti lungimea sirului:");
        int[] array = new int[x];
        int valoare;
        int pow;

        for(int i = 0; i < array.length; i++){
            valoare = SkeletonJava.readIntGUI("Introduceti o valoare pentru pozitia " + i + " :");
            if(valoare < 0){
                SkeletonJava.printGUI("pe pozitia " + i + " s-a introdus valoarea negativa: " + valoare);
                pow = valoare * valoare;
                SkeletonJava.printGUI("pe pozitia " + i + " numarul negativ " + valoare + " a devenit: " + pow);
            }
            else{
                SkeletonJava.printConsole("pe pozitia " + i + " se afla valoarea: " + valoare);
            }
        }
    }
}
