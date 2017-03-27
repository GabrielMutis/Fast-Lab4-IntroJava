import java.lang.reflect.Array;
import java.util.Arrays;
/**
 * Created by mutis on 26.03.2017.
 */
public class SirDublatTriplat {
    public static void main(String[] args) {
        int nr;
        nr = SkeletonJava.readIntConsole("introduceti dimensiunea sirului: ");
        int[] sir = new int[nr];
        int i;
        i = 0;
        do{
            sir[i] = SkeletonJava.readIntConsole("introduceti un numar: ");
            i++;
        }
        while(i < nr);
        String showSirInitial;
        showSirInitial = Arrays.toString(sir);
        System.out.println(showSirInitial);

        for(int j = 0; j < sir.length; j++){
            if((j < sir.length / 2) && sir[j] % 2 != 0){
                sir[j] *= 2;
            }
            if(j > sir.length / 2 && sir[j] % 2 != 0){
                sir[j] *= 3;
            }
        }
        String showSirFinal;
        showSirFinal = Arrays.toString(sir);
        System.out.println(showSirFinal);
    }
}
