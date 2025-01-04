import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your triangle's height: ");

        int height = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= height; i++) {

            String whiteSpaces = " ".repeat(height - i);
            String mark = "O".repeat(2 * i - 1);

            System.out.println(whiteSpaces + mark);
        }
    }
}
