import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        var console = new Scanner(System.in);

        final double minPurchase = 1000.00;
        double currentPurchase, discountAmount, totalToPay;
        boolean isMember;
        int percentageDiscount;

        System.out.print("How much have you spent today?: ");
        currentPurchase = Double.parseDouble(console.nextLine());

        System.out.print("Are you a member of the store? (true / false): ");
        isMember = Boolean.parseBoolean(console.nextLine());

        if (isMember && currentPurchase >= minPurchase) {
            percentageDiscount = 10;
        } else if (isMember) {
            percentageDiscount = 5;
        }else{
            percentageDiscount = 0;
        }

        discountAmount = currentPurchase / 100 * percentageDiscount;
        totalToPay = currentPurchase - discountAmount;

        System.out.printf("""
                %nYou get a %d%% discount
                You save %.2f€
                The total to pay is %.2f€
                """, percentageDiscount, discountAmount, totalToPay);

    }
}
