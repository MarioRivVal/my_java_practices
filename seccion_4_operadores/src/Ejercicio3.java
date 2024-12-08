import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args){

        var console = new Scanner(System.in);

        final int limitDistance = 3000;
        boolean isMember = false;
        int distance = 0;

        System.out.print("How far away do you live?(distance in meters): ");
        distance = Integer.parseInt(console.nextLine());

        System.out.print("Are you a member of the library (true / false)? ");
        isMember = Boolean.parseBoolean(console.nextLine());

        boolean canTakeBooks = isMember || distance <= limitDistance;
        System.out.println("You can take the book? " + canTakeBooks);


    }
}
