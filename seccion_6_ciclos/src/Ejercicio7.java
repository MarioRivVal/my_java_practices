import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        final int MIN_CHAR = 6;
        final int MAX_CHAR = 10;

        while (true) {
            System.out.print("\nEnter a new password with at least 6 characters: ");

            String password = scanner.nextLine();

            if (password.length() >= MIN_CHAR && password.length() <= MAX_CHAR) {

                System.out.println("Your new password is accepted");
                break;
            } else {
                System.out.printf("Your password must to have at least %d characters and maximum %d characters\n", MIN_CHAR, MAX_CHAR);
            }
        }
    }
}
