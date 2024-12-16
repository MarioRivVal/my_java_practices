import java.util.Scanner;

public class Ejercicio12 {

    public static void main(String[] args) {

        var console = new Scanner(System.in);

        final String USERNAME = "admin";
        final String PASSWORD = "1234";

        System.out.print("Username: ");
        String currentUsername = console.nextLine().strip();

        System.out.print("Password: ");
        String currentPassword = console.nextLine().strip();

        String message = switch (currentUsername) {
            case USERNAME:
                if (PASSWORD.equals(currentPassword)) {
                    yield "Welcome to the service";

                } else {
                    yield "Password incorrect, try again";
                }
            default:
                if (PASSWORD.equals(currentPassword)) {
                    yield "User incorrect, try again";
                } else {
                    yield "User and Password incorrect, try again";
                }
        };

        System.out.println(message);
    }
}
