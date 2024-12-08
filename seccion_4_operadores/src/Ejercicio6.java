import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args){

        var console = new Scanner(System.in);

        int base, height, area, perimeter;

        System.out.print("Please enter a base (cm): ");
        base = Integer.parseInt(console.nextLine());

        System.out.print("Please enter a height (cm): ");
        height = Integer.parseInt(console.nextLine());

        area = base * height;
        perimeter =( base + height) * 2;

        System.out.printf("""
                %n------------------
                Area: %d cm²
                Perimeter: %d cm
                """, area, perimeter);
    }
}
