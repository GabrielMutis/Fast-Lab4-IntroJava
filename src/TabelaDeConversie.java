/**
 * Created by mutis on 19.03.2017.
 */
public class TabelaDeConversie {
    public static void main(String[] args){
        int Temp;
        Temp = SkeletonJava.readIntGUI("0 for Celsius and 32 for Fahrenheit.");
        int Celsius, Fahrenheit;
        Celsius = 0;
        Fahrenheit = 32;
        if(Temp == Celsius){
            float F;
            F = SkeletonJava.readIntGUI("Introduceti o temperatura in Fahrenheit:");
            float C;
            C = 5 / 9F * (F - 32); //exemplu daca se introduce F = 68 va rezulta C = 20
            SkeletonJava.printGUI("Temperatura din Fahrenheit in Celsius este :" + C + " grade");
        }
        else if(Temp == Fahrenheit){
                float C;
                C = SkeletonJava.readIntGUI("Introduceti o temperatura in Celsius:");
                float F;
                F = C * 9 / 5 + 32;
                SkeletonJava.printGUI("Temperatura din Celsius in Fahrenheit este : " + F + " grade");
        }
    }
}
