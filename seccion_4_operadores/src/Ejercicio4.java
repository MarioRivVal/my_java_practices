import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        var console = new Scanner(System.in);

        final int taxPercentage = 20;
        double pastaPrice = 0;
        double ricePrice = 0;
        double drinkPrice = 0;
        double fruitPrice = 0;
        double subtotal = 0;
        double tax = 0;
        double finalTotal = 0;

        System.out.print("How much is pasta?: ");
        pastaPrice = Double.parseDouble(console.nextLine());

        System.out.print("How much is rice?: ");
        ricePrice = Double.parseDouble(console.nextLine());

        System.out.print("How much is drink?: ");
        drinkPrice = Double.parseDouble(console.nextLine());

        System.out.print("How much is fruit?: ");
        fruitPrice = Double.parseDouble(console.nextLine());

        subtotal = pastaPrice + ricePrice + drinkPrice + fruitPrice;
        tax = (subtotal / 100) * taxPercentage;

        finalTotal = subtotal + tax ;

        System.out.printf("""
        %n----- TICKET ------
        ---------------------
        Subtotal: €%.2f
        Tax 20%%: €%.2f
        Total: €%.2f
        ---------------------
        """, subtotal, tax, finalTotal);

    }
}
