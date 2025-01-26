import java.util.Scanner;

public class Ejercicio4 {

    static final int BEST_RATING = 90;

    // FUNCTION TO TRANSFORM STRINGS NUMBERS IN AN ARRAY INTO INTEGERS
    static int[] parseInt(String[] arr) {
        int[] num = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            num[i] = Integer.parseInt(arr[i]);
        }
        return num;
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

    // FUNCTION TO GET THE HIGHEST RATING
    static int findMaxRating(int[] arr) {
        int highest = 0;
        for (int n : arr) {
            if (n > highest) {
                highest = n;
            }
        }
        return highest;
    }

    // FUNCTION TO COUNT HOW MANY STUDENT HAS RATING HIGHER THAN 90
    static int countRatingsAboveThreshold(int[] arr) {
        int higherThanNineteen = 0;

        for (int n : arr) {
            if (n >= BEST_RATING) {
                higherThanNineteen++;
            }
        }
        return higherThanNineteen;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the student's rating separated by space: ");

        String[] numString = scanner.nextLine().trim().split("\\s+");

        if (numString.length == 1 && numString[0].isEmpty()) {
            System.out.println("Any rating has been written");
            return;
        }

        int[] numbers = parseInt(numString);

        System.out.printf("""
                The average of the ratings is: %.2f
                The heighest rating is: %d
                Ratings higher or equal than %d are: %d
                """, getAverage(numbers), findMaxRating(numbers), BEST_RATING, countRatingsAboveThreshold(numbers));

    }
}

// 58 67 98 67 90 78 98 86 76 45 97 44 89 56 10 95 97 69 99