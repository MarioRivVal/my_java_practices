import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {

        var console = new Scanner(System.in);

        String season;

        System.out.print("Please enter a number(1 -12)");
        int num = Integer.parseInt(console.nextLine());

        season = switch (num) {
            case 1, 2, 12 -> "Winter";
            case 3, 4, 5 -> "Spring";
            case 6, 7, 8 -> "Summer";
            case 9, 10, 11 -> "Autumn";
            default -> "unknown";
        };

        System.out.printf("The season is %s", season);
    }
}
