import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double num1 = 0, num2 = 0, result = 0;
        boolean turnOff = false;

        int userSelection = 0;
        char operator = ' ';

        while (!turnOff) {

            System.out.print("""
                    \nSelect a operation:
                    1. Addition
                    2. Subtraction
                    3. Multiplication
                    4. Division
                    5. Turn off
                    Your selection:\s""");
            while (true) {


                if (scanner.hasNextInt() && (userSelection = scanner.nextInt()) >= 1 && userSelection <= 4) {

                    scanner.nextLine();

                    System.out.print("Enter the first value: ");
                    num1 = Double.parseDouble(scanner.nextLine());

                    System.out.print("Enter the second value: ");
                    num2 = Double.parseDouble(scanner.nextLine());

                    boolean validOperation = true;

                    switch (userSelection) {

                        case 1 -> {
                            operator = '+';
                            result = num1 + num2;
                        }
                        case 2 -> {
                            operator = '-';
                            result = num1 - num2;
                        }
                        case 3 -> {
                            operator = '*';
                            result = num1 * num2;
                        }
                        case 4 -> {
                            if (num2 > 0) {
                                operator = '/';
                                result = num1 / num2;
                            } else {
                                System.out.println("ERROR: You can't divide a number by zero");
                                validOperation = false;
                            }

                        }

                        default -> System.out.println("Select a number between 1 and 5");
                    }

                    if (validOperation) {
                        System.out.printf("%.2f %s %.2f = %.2f\n", num1, operator, num2, result);
                    }

                    break;
                } else if (userSelection == 5) {
                    turnOff = true;
                    System.out.println("Calculator off");
                    break;
                } else {
                    System.out.println("\nPlease select one of the right options");
                    scanner.nextLine();
                }
            }
        }


    }
}
