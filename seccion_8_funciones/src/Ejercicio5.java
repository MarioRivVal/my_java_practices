import java.util.Scanner;

public class Ejercicio5 {

    // FUNCTION TO TRANSFORM STRINGS NUMBERS IN AN ARRAY WITH INTEGERS
    static int[] parseInt(String[] arr) {
        int[] num = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            num[i] = Integer.parseInt(arr[i]);
        }
        return num;
    }

    // FUNCTION TO COUNT HOW MANY NUMBER ARE 3 DIGITS
    static int countThreeDigitsNumbers(int[] arr) {
        int count = 0;
        for (int n : arr) {
            if (n > 99 && n < 1000) {
                count++;
            }
        }
        return count;
    }

    // FUNCTION TO COUNT HOW MANY NUMBER ARE EVEN
    static int countEvenNumbers(int[] arr) {
        int count = 0;
        for (int n : arr) {
            if (n % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    // FUNCTION TO GET THE AVERAGE
    static double getAverage(int[] arr) {
        int total = 0;
        for (int n : arr) {
            total += n;
        }
        double average = (double) total / arr.length;
        return Math.floor(average * 100) / 100.0;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your number separated by space: ");

        String[] stringNumbers = scanner.nextLine().trim().split("\\s+");

        if (stringNumbers.length == 1 && stringNumbers[0].isEmpty()) {
            System.out.println("Any rating has been written");
            return;
        }

        int[] numbers = parseInt(stringNumbers);

        System.out.printf("""
                Numbers with 3 digits are: %d
                Even number are: %d
                The average is: %.2f
                """, countThreeDigitsNumbers(numbers), countEvenNumbers(numbers), getAverage(numbers));


    }
}

// 234 4569 23 389 3498 17 348 985 23 3658 34 268 4890
