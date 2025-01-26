import java.util.Scanner;

public class Ejercicio2 {

    // Function to determinate if the word is palindrome
    static Boolean isPalindrome(String str) {
        String reverseString = new StringBuilder(str).reverse().toString();
        return str.equals(reverseString);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a word: ");
        String userWord = scanner.nextLine().trim().toLowerCase();

        String stringToPrint = "The word " + userWord + (isPalindrome(userWord) ? " is" : " is not") + " palindrome";

        System.out.println(stringToPrint);
    }
}
