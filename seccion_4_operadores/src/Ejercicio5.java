import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {

        var console = new Scanner(System.in);

        final String user = "netneo";
        final String password = "369";
        String currentUser = "";
        String currentPassword = "";
        boolean isAuth = false;

        System.out.print("Username: ");
        currentUser= console.nextLine();

        System.out.print("Password: ");
        currentPassword = console.nextLine();


        isAuth = user.equals(currentUser)  && password.equals(currentPassword);
        System.out.println("Data is correct?: " + isAuth);


    }
}
