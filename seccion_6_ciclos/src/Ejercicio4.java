import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        System.out.print("Enter a integer number: ");

        int num = Integer.parseInt(console.nextLine());
        int sum = 0;

        for (int i = 1; i <= num; i++) {
            System.out.println(sum + " + " + i);
            sum += i;
            System.out.println(sum);
        }
    }
}
