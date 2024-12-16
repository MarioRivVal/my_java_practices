import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {

        var console = new Scanner(System.in);

        final double NATIONAL_PRICE = 10;
        final double INTERNATIONAL_PRICE = 25;
        double kilos, finalPrice;
        String destination;

        System.out.print("Enter destination (national / international): ");
        destination = console.nextLine().strip().toLowerCase();

        System.out.print("Enter how many kilos: ");
        kilos = Double.parseDouble(console.nextLine());

        finalPrice = switch (destination) {
            case "national" -> NATIONAL_PRICE * kilos;
            case "international" -> INTERNATIONAL_PRICE * kilos;
            default -> {
                System.out.println("Destination no valid");
                yield 0;
            }
        };

        if (finalPrice != 0) {
            System.out.printf("The price for your shipment is %.2f", finalPrice);
        }
    }
}
