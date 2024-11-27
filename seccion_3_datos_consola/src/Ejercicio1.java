import java.util.Random;
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args){

        var console = new Scanner(System.in);
        Random random = new Random();
        StringBuilder userName = new StringBuilder();

        int randomNumber = random.nextInt(100, 1000) ;
        String name;
        String surname;

        System.out.print("Please insert your name: ");
        name = console.nextLine();

        System.out.print("Please insert your surname: ");
        surname = console.nextLine();


        String formatedName = name.trim().toLowerCase().substring(0,3);
        String formattedSurname = surname.trim().toUpperCase().substring(0,3);

        userName.append(formatedName).append(formattedSurname).append(randomNumber);

        System.out.printf("Your USERNAME is: %s", userName );


    }
}
