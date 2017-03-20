import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Arrays;

/**
 * Created by mutis on 20.03.2017.
 */
public class LearnArray {
    public static void main(String[] args){
        int[] values;
        values = new int[3];
        /*java gives a default value
        System.out.println(values[0]);
        System.out.println(values[1]);
        System.out.println(values[2]);
        */
        values[0] = 1;
        values[1] = 2;
        values[2] = 3;

        String show = Arrays.toString(values);
        //parcurgerea unui array folosind for

        for(int i = 0; i < values.length; i++){
            if(values[i] == 2){ //dorim sa aflam pozitia pe care se afla o anumita valoare
                System.out.println("on position " + i + " is the value you are searching.");  //afisam pozitia
                System.out.println("this is the entire array: " + show); //to output sa entire array we need to use a command
            }
            else{
                System.out.println("on position " + i +" there is no such value!");
            }
        }

    }
}
