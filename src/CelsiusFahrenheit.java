/**
 * Created by mutis on 22.03.2017.
 */
public class CelsiusFahrenheit {
    public static void main(String[] args) {
        float celsius, fahrenheit;
        //celsius = 5 / 9 * (fahrenheit - 32);
        //fahrenheit = celsius * 9 / 5 + 32;
        String C, F, temp;
        C = "celsius";
        F = "fahrenheit";
        int stop;
        stop = 0;
        do{
            temp = SkeletonJava.readStringGUI("In ce tip de temperatura doriti sa lucrati? (celsius/fahrenheit)");
            if(temp.equals(C)){
                SkeletonJava.printGUI("Ati ales " + temp);
                celsius = SkeletonJava.readIntGUI("introduceti o temperatura in celsius:");
                fahrenheit = celsius * 9f / 5f + 32;
                SkeletonJava.printConsole("temperatura din " + celsius + " grade celsius in fahrenheit este: " + fahrenheit +" grade");
                stop = SkeletonJava.readIntGUI("introduceti -1 pentru a opri programul sau altceva");
            }
            else if(temp.equals(F)){
                SkeletonJava.printGUI("Ati ales " + temp);
                fahrenheit = SkeletonJava.readIntGUI("introduceti o temperatura in celsius:");
                celsius = 5f / 9f * (fahrenheit - 32);
                SkeletonJava.printConsole("temperatura din " + fahrenheit + " grade fahrenheit in celsius este: " + celsius +" grade");
                stop = SkeletonJava.readIntGUI("introduceti -1 pentru a opri programul sau altceva");
            }
            else{
                SkeletonJava.printGUI("va rog introduceti celsius/fahrenheit pentru a continua");
                stop = SkeletonJava.readIntGUI("sau introduceti -1 pentru a opri programul");
            }
        }
        while(stop != -1);
        SkeletonJava.printConsole("Program terminat");
    }
}
