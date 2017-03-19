import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by mutis on 19.03.2017.
 */
public class SirDeNumere {
    public static void main(String[] args){
        int[] array = new int[5];
        array[0] = 5;
        array[1] = 3;
        array[2] = 7;
        array[3] = 11;
        array[4] = 23;
        //echivalent cu int[] array = {5, 3, 7, 11, 23};

        //maximul unui array
        int max = array[0];

        for(int i = 0; i < array.length; i++){
            if(max < array[i]){
                max = array[i];
            }
        }
        SkeletonJava.printConsole("Max sirului este: " + max);

        //minimul unui array
        int min =  array[0];

        for(int j = 0; j < array.length; j++){
            if (min > array[j]){
                min = array[j];
            }
        }
        SkeletonJava.printConsole("Min sirului este:" + min);

        //suma elementelor unui sir

        int suma;
        suma = 0;
        for(int k = 0; k < array.length; k++){
            suma += array[k];
        }
        SkeletonJava.printConsole("Suma elementelor unui sir este: " + suma);

        //sirul dublat
        for(int l = 0; l < array.length; l++){
            array[l] *= 2;
            SkeletonJava.printConsole("pentru pozitia " + l +" avem valoarea " + array[l]);
        }
        SkeletonJava.printConsole("sirul dublat " + Arrays.toString(array));
    }
}
