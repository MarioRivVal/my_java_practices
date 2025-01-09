import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int ratingsNumber;
        int[] ratings;
        double average =0.0;

        System.out.print("How many ratings will be calculated?: ");
        ratingsNumber = Integer.parseInt(scanner.nextLine());

        ratings = new int[ratingsNumber];

        for(int i = 0; i < ratingsNumber; i++){
            System.out.print("ratings[" + i + "] = " );
            ratings[i] = Integer.parseInt(scanner.nextLine());

            average += ratings[i];
        }
        average = Math.round(average / ratings.length);

        System.out.println("The average of the " + ratingsNumber + " ratings is " + average);
    }
}
