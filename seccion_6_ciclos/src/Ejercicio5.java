import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int balance = 1000;
        boolean login = true;

        System.out.println("""
                \n------------------------------------------
                   Welcome to your personal NEOMONEY ATM
                ------------------------------------------
                """);


        while (login) {

            System.out.print("""
                    \n
                    What operation do you want to do today?
                    1. Deposit
                    2. Withdraw
                    3. View your balance
                    4. Logout
                    Select:\s""");

            int option = Integer.parseInt(console.nextLine());

            switch (option) {
                case 1 -> {
                    System.out.print("\nHow much money do you want to deposit? ");
                    int deposit = Integer.parseInt(console.nextLine());
                    balance += deposit;

                    System.out.printf("\nYour new balance is: €%d ", balance);

                }
                case 2 -> {
                    System.out.printf("\nHow much money do you want to withdraw? your availability is €%d): ", balance);
                    int withdraw = Integer.parseInt(console.nextLine());

                    if (withdraw <= balance) {
                        balance -= withdraw;
                        System.out.printf("\nYour new balance is: €%d ", balance);
                    } else {
                        System.out.printf("You have exceeded the limit, your availability is €%d", balance);
                    }
                }
                case 3 -> {
                    System.out.printf("\nYour balance today is: €%d ", balance);
                }
                case 4 -> {
                    System.out.println("""
                            \nYou have logged out
                            -------------------
                                 THANK YOU
                            -------------------
                            """);
                    login = false;
                }
                default -> System.out.println("Invalid selection, try again");
            }
        }
    }
}
