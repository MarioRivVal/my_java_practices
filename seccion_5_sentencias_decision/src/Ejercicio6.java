import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args){

        var console = new Scanner(System.in);

        final double  ROOM_WITH_SEAVIEW_PRICE = 190.50;
        final double ROOM_WITHOUT_SEAVIEW_PRICE = 150.50;

        String username,hasViewString;
        int stayingDays;
        boolean hasSeaview;

        double totalToPay;

        System.out.print("What is your name?: ");
        username = console.nextLine();

        System.out.print("How many days would you like to stay?: ");
        stayingDays = Integer.parseInt(console.nextLine());

        System.out.print("Would you like to have sea view at your room? (true / false): ");
        hasSeaview = Boolean.parseBoolean(console.nextLine());

        totalToPay = hasSeaview ? stayingDays * ROOM_WITH_SEAVIEW_PRICE : stayingDays * ROOM_WITHOUT_SEAVIEW_PRICE;
        hasViewString = hasSeaview ? "has" : "has not";

        System.out.printf("""
                %n--------------------------
                YOUR RESERVATION'S DETAILS
                ----------------------------
                Hello, %s
                You have %d days booked with us
                Your room %s a sea view
                The price for day is €%.2f
                The total price is €%.2f
                ----------------------------
                THANK YOU FOR BOOK WITH US
                ----------------------------
                """, username, stayingDays,hasViewString, hasSeaview ? ROOM_WITH_SEAVIEW_PRICE : ROOM_WITHOUT_SEAVIEW_PRICE, totalToPay);
    }
}
