import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {

        var console = new Scanner(System.in);


        System.out.print("Please enter a number (1 -12): ");
        int number = Integer.parseInt(console.nextLine());

        if (number == 1 || number == 2 || number == 12) {
            System.out.println("Your season is winter");

        } else if (number == 3 || number == 4 || number == 5) {
            System.out.println("Your season is spring");

        } else if (number == 6 || number == 7 || number == 8) {
            System.out.println("Your season is summer");

        } else if (number == 9 || number == 10 || number == 11) {
            System.out.println("Your season is autunm");

        } else {
            System.out.println("Unknown season");

        }
    }
}
