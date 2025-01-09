import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your number separated by space: ");
        String userInput = scanner.nextLine();

        int minNumber;
        int maxNumber;

        String[] numbersStrings = userInput.split(" ");

        int[] numbers = new int[numbersStrings.length];

        for (int i = 0; i < numbers.length; i++){
            numbers[i] = Integer.parseInt(numbersStrings[i]);
        }

        maxNumber= numbers[0];
        minNumber= numbers[0];

        for(int num : numbers){

            if(num < minNumber){
                minNumber = num;
            }

            if(num > maxNumber){
                maxNumber = num;
            }
        }

        System.out.println("maxNumber = " + maxNumber);
        System.out.println("minNumber = " + minNumber);
    }
}
