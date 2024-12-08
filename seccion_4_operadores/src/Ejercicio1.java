import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args){

        var console = new Scanner(System.in);

        var number = 0;
        final int initialValue = 0;
        final int finalValue = 5;

        System.out.print("Enter a integer number: ");
        number = Integer.parseInt(console.nextLine());

        System.out.println(number >= initialValue && number <= finalValue);
    }
}
