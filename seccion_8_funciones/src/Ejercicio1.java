import java.util.Scanner;

public class Ejercicio1 {

    // Function for the addition
    static int addNumbers(int[] arr) {

        int total = 0;

        for (int num : arr) {
            total += num;
        }
        return total;
    }

    // Function for average
    static double getAverage(int total, int numbersAmount) {
        return (double) total / numbersAmount;
    }

    // Function to print the results
    static void printResults(int total, double average) {
        System.out.printf("\nThe addition total is %d", total);
        System.out.printf("\nThe average is: %.1f", average);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your numbers separated by space: ");

        String[] numbersString = scanner.nextLine().split(" ");

        int[] nums = new int[numbersString.length];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(numbersString[i]);
        }


        int total = addNumbers(nums);
        double average = getAverage(total, nums.length);

        printResults(total, average);
    }
}
