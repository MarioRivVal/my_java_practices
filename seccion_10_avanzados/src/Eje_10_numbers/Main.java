package Eje_10_numbers;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter an integer number: ");

            try {
                String userInput = scanner.nextLine();
                int num = NumbersValidator.convertStringToNumber(userInput);
                System.out.println("You entered the number: " + num);
                break;

            } catch (NumberFormatException e) {
                System.err.println("Error: the input is not a valid number. Please try again.");

            }
        }
    }
}

