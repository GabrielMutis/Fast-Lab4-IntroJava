import java.io.IOException;

/**
 * Created by mutis on 02.04.2017.
 */
public class userPassword {
    public static void main(String[] args) {
        //cere user si parola
        //verificarea user-ului si parolei
        //daca user si parola corect continuam daca nu repetam cererea...
        //daca indeplineste prima conditile lanseaza o aplicatie...
        String username, password;
        do{
            username = SkeletonJava.readStringConsole("introduceti user name-ul: ");
            password = SkeletonJava.readStringConsole("introduceti parola: ");
            userSiParola(username, password);
            verificareUserSiParola(username, password);
        }
        while(!username.equals("Gabriel") && !password.equals("Robinhood"));
    }

    public static void userSiParola(String user, String parola) {
        System.out.println("S-a introdus user-ul: " + user + " si parola: " + parola);
    }

    public static void verificareUserSiParola(String userName, String Password) {
            //compara user si parola
            //daca conditia este indeplinita apeleaza metoda care va deschide un program...
            //daca conditia nu este indeplinita introdu din nou user si parola...

            if(userName.equals("Gabriel") && Password.equals("Robinhood")){
                //apeleaza o metoda care va deschide un program
                System.out.println("esti pe drumul cel bun");
                runNotePad();
            }
            else{
                System.out.println("mai incearca");
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
