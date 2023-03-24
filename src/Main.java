import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

@SuppressWarnings({"ReassignedVariable"})
public class Main {
    static boolean isAccessGranted;
    static Scanner userInput;

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter password... ");
        String password = userInput.nextLine();

        boolean isAccessGranted = false;

        if (password.equals("Artyomka")) {
            System.out.println("Access Granted.");
            isAccessGranted = true;
            App secretApp = new App();
            secretApp.app();
        } else {
            while (!password.equals("Artyomka")) {
                System.out.println("Enter password again... ");
                password = userInput.nextLine();
            }
        }
    }

    static class App {
        void app(){
            System.out.println("Would you like to see the weather?");
            Scanner appInput = new Scanner(System.in);
            String yerOrNo = appInput.nextLine();

            if (yerOrNo.equals("yes")){
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMM yyy | HH:mm:ss");
                System.out.println(dateFormat.format(new Date()));
                System.out.println("Okay. Goodbye :)");
            } else {
                System.out.println("Okay. Goodbye!");
            }

        }

    }

}
