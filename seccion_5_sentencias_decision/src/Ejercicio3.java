import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args){

        var console = new Scanner(System.in);
        boolean response;

        System.out.print("Do you want to continue using the application? (true / false)");
        response =  Boolean.parseBoolean(console.nextLine());

        if(!response){
            System.out.println("You continue using our services");
        }else{
            System.out.println("Exiting the system..");
        }


    }
}
