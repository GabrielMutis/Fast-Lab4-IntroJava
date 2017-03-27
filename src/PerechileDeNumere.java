import java.util.Arrays;

/**
 * Created by mutis on 27.03.2017.
 */
public class PerechileDeNumere {
    public static void main(String[] args) {
        //int[] array = {11, 13, 9, 8, 16};
        /*
        int[] array = new int[5];
        array[0] = 11;
        array[1] = 13;
        array[2] = 9;
        array[3] = 8;
        array[4] = 16;
        */
        int dim;
        do{
            System.out.println("introduceti o valoare intreaga mai mare ca 0");
            dim = SkeletonJava.readIntConsole("introduceti dimensiunea sirului: ");
        }
        while(dim < 1);

        int[] array = new int[dim];
        int j;
        j = 0;
        do{
            array[j] = SkeletonJava.readIntConsole("introduceti un numar: ");
            j++;
        }
        while(j < array.length);

        String showArray;
        showArray = Arrays.toString(array);
        System.out.println("avem arrayul: " + showArray);

        int i;
        i = 0;

        /*
        do{
            i++;
            if(array[i] > array[i-1]){
                System.out.println(array[i]);
            }
            else{
                System.out.println(array[i-1]);
            }
        }
        while(i < array.length - 1);
        */
        do{
            if(array[i] > array[i+1]){
                System.out.println(array[i]);
            }
            else{
                System.out.println(array[i+1]);
            }
            i++;
        }
        while(i < array.length - 1);
    }
}
