/**
 * Created by mutis on 19.03.2017.
 */
public class FromFahrenheitToCelsius {
    public static void main(String[] args){
        // formula T(C) = 5/9 * (F - 32)
        float F;
        F = SkeletonJava.readIntGUI("Introduceti o temperatura in Fahrenheit:");
        float C;
        C = 5/9F * (F - 32); //exemplu daca se introduce F = 68 va rezulta C = 20
        SkeletonJava.printGUI("Temperatura din Fahrenheit in Celsius este: " + C);
    }
}
