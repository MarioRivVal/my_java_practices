import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args){

        var console = new Scanner(System.in);

        int number;

        System.out.print("Please insert a number: ");
        number = Integer.parseInt(console.nextLine());

        if(number > 0){
            System.out.println("Your number is positive");
        }else if(number < 0){
            System.out.println("Your number is negative");
        }else{
            System.out.println("Your number is 0");
        }
    }
}
