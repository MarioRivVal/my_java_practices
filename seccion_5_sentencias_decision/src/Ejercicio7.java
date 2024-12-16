import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {

        var console = new Scanner(System.in);

        int num1, num2, largestNumber;

        System.out.print("Enter the first number: ");
        num1 = Integer.parseInt(console.nextLine());

        System.out.print("Enter the second number: ");
        num2 = Integer.parseInt(console.nextLine());

        largestNumber = num1 > num2 ? num1 : num2;

        String finalString = "The largest number between %d and %d is %d ".formatted(num1, num2, largestNumber);

        System.out.println(finalString);


    }
}
