import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args){

        var console = new Scanner(System.in);

        final int minProducts = 10;
        var products = 0;
        var isMember = false;

        System.out.print("How many product did you buy?: ");
        products = Integer.parseInt(console.nextLine());

        System.out.print("Are you a shop member? (true / false): ");
        isMember = Boolean.parseBoolean(console.nextLine());

        boolean haveDiscount = products >= minProducts && isMember;

        System.out.println("You have discount of 10%? " + haveDiscount);
    }
}