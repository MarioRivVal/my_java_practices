import java.util.Scanner;


public class Ejercicio10 {

    public static void main(String[] args) {

        var console = new Scanner(System.in);
        char score;
        int number;

        System.out.print("Please insert a number (1 -10)");
        number = Integer.parseInt(console.nextLine());

        score = switch (number) {
            case 9, 10 -> 'A';
            case 8 -> 'B';
            case 7 -> 'C';
            case 6 -> 'D';
            case 0, 1, 2, 3, 4, 5 -> 'F';
            default -> '-';
        };

        System.out.printf("%nYour number %d is mean a score of %s", number, score);
    }
}


