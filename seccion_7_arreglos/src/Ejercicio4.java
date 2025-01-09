import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String userSentence;
        int totalWords;
        String longestWord = "";
        int longestWordLength =0;
        int longestThanFive = 0;


        System.out.print("Enter a sentence: ");
        userSentence = scanner.nextLine();

        if (userSentence.isBlank()) {
            System.out.println("You entered an empty sentence. Exiting program...");
            return;
        }

        String[] stringsArr = userSentence.replaceAll("[^a-zA-Z0-9 ]", "").split(" ");

        totalWords = stringsArr.length;

        for(String word: stringsArr){

            if(word.length() > longestWordLength){
                longestWordLength = word.length();
                longestWord = word;
            }

            if(word.length() > 5 ){
                longestThanFive ++;
            }

        }

        System.out.printf("""
                \nTotal words: %d
                Longest word: %s (%d characters)
                Word with more than 5 characters: %d
                
                Word details:
                """,totalWords,longestWord,longestWordLength,longestThanFive);

        for(String word : stringsArr){
            System.out.printf("""
                    %s (%d)
                    """,word, word.length());
        }
    }
}
