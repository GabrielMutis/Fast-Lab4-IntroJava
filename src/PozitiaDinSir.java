/**
 * Created by mutis on 26.03.2017.
 */
public class PozitiaDinSir {
    public static void main(String[] args) {
        //int[] sir = {1, 3, 4, 6, 7, 8, 10, 12, 14, 23};
        int[] sir = {21, 2, 8, 34, 5, 1, 2, 77, 15, 17, 2};
        int nr;
        nr = SkeletonJava.readIntConsole("introduceti un numar:");
        int poz = -1;

        for(int i = 0; i < sir.length; i++){
            if(nr == sir[i]) {
                SkeletonJava.printConsole("numarul " + nr + " se afla pe pozitia: " + i);
                poz = i;
            }
        }
        if(poz == -1){
            SkeletonJava.printConsole(-1 + " nu exista acest numar in sir");
        }
    }
}
