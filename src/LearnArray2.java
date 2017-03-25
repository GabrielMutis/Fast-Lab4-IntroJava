/**
 * Created by mutis on 20.03.2017.
 */
public class LearnArray2 {
    public static void main(String[] args){
         int[] array = {6, 24, 125, 864, 3125};

         for(int i = 0; i < array.length; i++){
             System.out.println("pe pozitia " + i + " se afla urmatoarea valoare: " + array[i]);
             if(array[i] % 5 == 0){
                 System.out.println("pe pozitia " + i + " se afla valoarea " + array[i] + " care este div cu 5");
             }
             else{
                 System.out.println("pe pozitia " + i + " se afla valoarea " + array[i] + " care nu este div cu 5");
             }
         }
    }
}
