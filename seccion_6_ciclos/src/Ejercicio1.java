import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        int userNumber;

        while (true) {
            System.out.print("Please enter a integer number: ");

            if (console.hasNextInt()) {
                userNumber = console.nextInt();
                int counter = 1;
                while (counter <= userNumber) {
                    System.out.println(counter);
                    counter++;
                }
                break;
            } else {
                System.out.println("Invalid number, please try again");
                console.nextLine();
            }
        }
    }
}
