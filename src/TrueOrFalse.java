/**
 * Created by mutis on 26.03.2017.
 */
public class TrueOrFalse {
    public static void main(String[] args) {
        int nr;
        nr = SkeletonJava.readIntConsole("introduceti un numar: ");
        boolean checkNumber;
        if (nr >= 9 && nr <= 24){
            checkNumber = true;
            System.out.println(checkNumber);
        }
        else{
            checkNumber = false;
            System.out.println(checkNumber);
        }
    }
}
