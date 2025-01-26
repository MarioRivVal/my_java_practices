import java.util.Scanner;

public class Ejercicio6 {
    
    // FUNCTION TO TRANSFORM STRINGS NUMBERS IN AN ARRAY WITH DOUBLES
    static double[] parseDouble(String[] arr) {
        double[] nums = new double[arr.length];
        for (int i = 0; i < arr.length; i++) {
            nums[i] = Double.parseDouble(arr[i]);
        }
        return nums;
    }

    // FUNCTION TO GET THE AVERAGE
    static double getAverage(double[] arr) {
        double total = 0;
        for (double n : arr) {
            total += n;
        }
        double average = (double) total / arr.length;
        return Math.floor(average * 100) / 100.0;
    }

    // FUNCTION TO FIND HOW MANY PEOPLE ARE HIGHER THAN THE AVERAGE
    static int countHigherThanAverage(double[] arr, double average) {
        int count = 0;
        for (double n : arr) {
            if (n > average) {
                count++;
            }
        }
        return count;

    }

    // FUNCTION TO FIND HOW MANY PEOPLE ARE HIGHER THAN THE AVERAGE
    static int countLowerThanAverage(double[] arr, double average) {
        int count = 0;
        for (double n : arr) {
            if (n < average) {
                count++;
            }
        }
        return count;
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the heights separated by space: ");
        String[] numbersString = scanner.nextLine().trim().split("\\s+");

        if (numbersString.length == 1 && numbersString[0].isEmpty()) {
            System.out.println("Any rating has been written");
            return;
        }

        double[] heights = parseDouble(numbersString);

        double average = getAverage(heights);


        System.out.printf("""
                La media de las alturas es: %.2f
                Personas mas altas de la media: %d
                Personas mas bajas de la media: %d
                """, average, countHigherThanAverage(heights, average), countLowerThanAverage(heights, average));

    }
}

// 1.50 1.65 1.80 1.52 1.90 1.78 1.67 1.78 1.67 1.86 1.82 1.79
