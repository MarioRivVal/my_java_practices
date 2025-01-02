import java.util.Random;
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();


        final String RED = "\033[31m";
        final String GREEN = "\033[32m";
        final String BLUE = "\033[34m";
        final String RESET = "\033[0m";

        int secretNumber = random.nextInt(50) + 1;
        int attemptNumber = 1;
        int maxAttempt = 10;
        int userNumber;
        boolean gameOver = false;

        System.out.println(GREEN + """
                __________________________
                |         WELCOME         |
                | GUESS THE SECRET NUMBER |
                --------------------------
                """ + RESET);

        while (!gameOver) {

            System.out.print("\nEnter a number (1 - 50): ");
            userNumber = Integer.parseInt(scanner.nextLine());

            if (userNumber == secretNumber) {
                System.out.printf("\n" + BLUE + "CONGRATULATION! " + RESET + "You discovered the secret number with %d attempts\n", attemptNumber);
                gameOver = true;

            } else {
                attemptNumber++;
                maxAttempt--;

                if (maxAttempt == 0) {
                    System.out.printf("\n" + RED + "GAME OVER " + RESET + "You have exhausted your possibilities, the secret number was %d", secretNumber);
                    gameOver = true;
                } else {
                    if (userNumber > secretNumber) {
                        System.out.println("\nThe secret number is lower");
                    } else {
                        System.out.println("\nThe secret number is higher");
                    }
                }
            }
        }
    }
}
