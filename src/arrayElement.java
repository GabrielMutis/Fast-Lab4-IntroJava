/**
 * Created by mutis on 21.03.2017.
 */
public class arrayElement {
    public static void main(String[] args) {
        int x;
        do{
            x = SkeletonJava.readIntGUI("introduceti o dimensiune pentru array");
            if(x > 0){
                SkeletonJava.printGUI("mergem mai departe");
            }
            else{
                SkeletonJava.printGUI("incercati din nou");
            }
        }
        while(x <= 0);
        String[] array = new String[x];

        for(int i = 0; i < array.length; i++){
            array[i] = SkeletonJava.readStringGUI("introduceti un element pentru pozitia " + i);
        }
        int i;
        x--;
        do{
            i = SkeletonJava.readIntGUI("introduceti o pozitie care apartine intervalului inchis: [" + 0 + ", " + x +"]");
            if(i >= 0 && i <= x){
                SkeletonJava.printGUI("pe pozitia " + i + " se afla: " + array[i]);
            }
            else{
                if(i != -1){
                    SkeletonJava.printConsole("ati introdus o valoare care nu apartine intervalului inchis: [" + 0 + ", " + x +"]");
                    SkeletonJava.printConsole("incercati din nou sau introduceti valoarea " + -1 + " in consola pentru a opri programul");
                }
                else{
                    SkeletonJava.printGUI("program terminat!");
                }
            }
        }
        while(i != -1);
    }
}
