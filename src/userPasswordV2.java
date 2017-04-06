import java.io.IOException;

/**
 * Created by mutis on 06.04.2017.
 */
public class userPasswordV2 {
    public static void main(String[] args) {
        /**
         * cere user si parola
         * verificarea user-ului si parolei
         * verificarea user-ului si parolei
         * daca user si parola corect continuam daca nu repetam cererea...
         * daca indeplineste prima conditile lanseaza o aplicatie...
         */

        String username, password;
        int a;
        do{
            a = SkeletonJava.readIntConsole("Introduceti 1 pentru a porni sau 0 pentru a opri: ");
            if(a != 0){
                username = SkeletonJava.readStringConsole("introduceti user name-ul: ");
                password = SkeletonJava.readStringConsole("introduceti parola: ");
                userSiParola(username, password);
                verificareUserSiParola(username, password);
            }
        }
        while(a != 0);
    }

    public static void userSiParola(String user, String parola) {
        System.out.println("S-a introdus user-ul: " + user + " si parola: " + parola);
    }

    public static void verificareUserSiParola(String userName, String Password) {
        //compara user si parola
        //daca conditia este indeplinita apeleaza metoda care va deschide un program...
        //daca conditia nu este indeplinita introdu din nou user si parola...
        String[] array1 = {"Gabriel", "Password1"};
        String[] array2 = {"Andrei", "Password2"};
        String[] array3 = {"Cristi", "Password3"};

        String[][] arrays = {array1, array2, array3};

        for(int i = 0; i < arrays.length; i++){
            for(int j = 0; j < arrays[i].length; j++){
                j++;
                if(userName.equals(arrays[i][j-1]) && Password.equals(arrays[i][j])){
                    //apeleaza o metoda care va deschide un program
                    System.out.println("esti pe drumul cel bun");
                    runNotePad();
                }
            }
        }
    }

    //metoda imprumutata...
    public static void runNotePad() {
        try {
            System.out.println("Opening notepad");
            Runtime runTime = Runtime.getRuntime();
            Process process = runTime.exec("notepad");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
