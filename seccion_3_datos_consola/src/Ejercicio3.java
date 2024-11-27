import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args){

        var console = new Scanner(System.in);

        System.out.print("How much is you initial principal: ");
        double principal = Double.parseDouble(console.nextLine());

        System.out.print("Select a rate (%) between 5 - 15 - 25 ");
        int rate = Integer.parseInt(console.nextLine());

        System.out.print("How many year? ");
        int time = Integer.parseInt(console.nextLine());

        double interest = ((principal * rate) / 100) * time;
        double totalInterest = principal + interest;

        String message = """
                In %d years, you generate:
                €%.2f of interest.
                With a initial principal of:
                €%.2f
                You will have an total interest of €%.2f
                """.formatted(time,interest,principal, totalInterest);
        System.out.println(message);



    }
}
