import java.util.Scanner;

public class Ejercicio3 {

    static int getWordCount(String[] arr) {
        return arr.length;
    }

    static String getLongestWord(String[] arr) {
        String longestWord = "";

        for (String word : arr) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        return longestWord;
    }

    static int getVowelWordStartCount(String[] arr) {

        int vowelWords = 0;

        for (String word : arr) {
            if (!word.isEmpty() && "aeiouAEIOU".indexOf(word.charAt(0)) != -1) {
                vowelWords++;
            }
        }

        return vowelWords;
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your sentence: ");

        String[] stringsArr = scanner.nextLine().trim().split("\\s+");

        if (stringsArr.length == 1 && stringsArr[0].isEmpty()) {
            System.out.println("Error: No words were entered.");
            return;
        }


        System.out.printf("""
                Your sentence has %d words
                %d of them starts with vowel
                and the largest word is %s
                """, getWordCount(stringsArr), getVowelWordStartCount(stringsArr), getLongestWord(stringsArr));
    }
}

// Java es un lenguaje de increíble