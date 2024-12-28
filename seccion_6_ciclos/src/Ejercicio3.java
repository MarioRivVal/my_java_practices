import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        while (true) {

            System.out.print("Enter a number: ");

            if (console.hasNextInt()) {

                int userNumber = console.nextInt();

                if (userNumber > 0) {
                    do {
                        if (userNumber % 2 != 0) {
                            System.out.print(userNumber + ", ");
                        }
                        userNumber--;
                    } while (userNumber > 0);

                    break;
                } else {
                    System.out.println("Number must to be positive, try again");
                }


            } else {
                System.out.println("Invalid input,try again");
                console.nextLine();
            }
        }
    }
}
