/**
 * Created by mutis on 26.03.2017.
 */
public class Factorial {
    public static void main(String[] args) {
        int nr, p;
        nr = SkeletonJava.readIntConsole("introduceti un nr: " );
        p = 1;
        System.out.println("s-a introdus numarul " + nr);
        System.out.println("se va calcula " + nr + "!");
        System.out.print(nr + "!=");
        for(int i = 1; i <= nr; i++){
            p *= i;
            System.out.print(i);
            if(i < nr){
                System.out.print("*");
            }
        }
        System.out.println();
        System.out.println(nr + "!=" + p);
    }
}
