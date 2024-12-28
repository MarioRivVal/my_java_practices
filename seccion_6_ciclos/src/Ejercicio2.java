import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);


        while (true) {
            System.out.print("Please enter a integer number: ");

            if (console.hasNextInt()) {
                int userNumber = console.nextInt();
                int currentNumber = 1;

                while (currentNumber <= userNumber) {

                    if (currentNumber % 2 == 0) {
                        System.out.print(currentNumber + ", ");
                    }
                    currentNumber++;
                }
                break;
            } else {
                System.out.println("Invalid input, try again");
                console.nextLine();
            }
        }


    }
}
