import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your integer numbers separated by a space: ");
        // 4 5 6 4 2 6 4 8 9 5 5 2 6 4 8 4 3 7 4 3 5 2 8 5 4 3 2 2 9
        String userInput = scanner.nextLine();

        String[] numbersStringArr = userInput.split(" ");

        int[] numbers = new int[numbersStringArr.length];

        for(int i = 0; i < numbers.length; i++){
            numbers[i] = Integer.parseInt(numbersStringArr[i]);
        }

        int[] frequencyArr = new int[numbers.length];

        for(int i = 0; i < numbers.length; i++){

            for(int j = 0; j < numbers.length; j++){
                if(numbers[i] == numbers[j]){
                    frequencyArr[i]++;
                }
            }
        }

        int mostFrequentNumber = numbers[0];
        int mostFrequency = frequencyArr[0];

        for(int i = 1; i < frequencyArr.length; i++){
            if(frequencyArr[i] > mostFrequency){
                mostFrequency = frequencyArr[i];
                mostFrequentNumber = numbers[i];
            }
        }

        System.out.println("The most frequent number is: " + mostFrequentNumber);
        System.out.println("It appears " + mostFrequency + " times");
    }
}
