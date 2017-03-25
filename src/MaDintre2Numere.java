/**
 * Created by mutis on 19.03.2017.
 */
public class MaDintre2Numere {
    public static void main(String[] args){
        int a, b;
        a = SkeletonJava.readIntGUI("introduceti primul numar:");
        b = SkeletonJava.readIntGUI("introduceti al doilea numar:");
        float c;
        c = (a + b)/ 2F;
        SkeletonJava.printGUI("Media aritmetica dintre " + a + " si " + b +" este: " + c);
    }
}
