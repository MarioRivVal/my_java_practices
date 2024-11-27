import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args){

        var console = new Scanner(System.in);

        int billAmount;
        int tipAmount;

        System.out.print("How much is the bill? ");
        billAmount = Integer.parseInt(console.nextLine());

        System.out.print("How much would you give as tip? Insert a number 0-100 ");
        tipAmount = Integer.parseInt(console.nextLine());

        int totalAmount = billAmount +( (billAmount * tipAmount) / 100);


        String printMessage = """
                ------- Bill -------
                --------------------
                Your Tip is %d%%
                --------------------
                Bill: €%d
                Total: €%d
                """.formatted(tipAmount,billAmount,totalAmount);

        System.out.print(printMessage);


    }
}
