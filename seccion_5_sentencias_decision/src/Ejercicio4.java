import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {

        var console = new Scanner(System.in);
        final int MIN_AGE = 10;
        int userAge;
        boolean isDarkAfraid;

        System.out.print("How old are you?: ");
        userAge = Integer.parseInt(console.nextLine());

        System.out.print("are you afraid of the dark? (true / false)");
        isDarkAfraid = Boolean.parseBoolean(console.nextLine());

        if(userAge >= MIN_AGE && !isDarkAfraid){
            System.out.println("You can enter the house of mirrors");
        }else{
            System.out.println("Sorry. You can't enter the house of mirrors");

        }
    }
}
