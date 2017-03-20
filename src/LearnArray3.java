import java.util.Arrays;

/**
 * Created by mutis on 20.03.2017.
 */
public class LearnArray3 {
    public static void main(String[] args) {
        int y;
        y = SkeletonJava.readIntConsole("Introduceti o dimensiune pentru array: ");
        String[] array;
        array = new String[y];

        for(int i = 0; i < array.length; i++){
            array[i] = SkeletonJava.readStringConsole("introduceti un string: ");
            //System.out.println(array[i]);
        }
        String arrayShow;
        arrayShow = Arrays.toString(array);
        System.out.println("array: " + arrayShow);
    }
}
