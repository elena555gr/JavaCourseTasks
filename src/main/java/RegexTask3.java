import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RegexTask3 {
    public static void main(String[] args) {
        BufferedReader br = null;

        try {
            br = new BufferedReader(new InputStreamReader(System.in));
            while (true) {
                System.out.print("Enter a sentence of 5 words: ");
                String input = br.readLine();
                if ("q".equals(input)) {
                    System.out.println("Exit!");
                    System.exit(0);
                }
                System.out.println("The longest word is: " + findTheLongestWord(input));
                System.out.println("The number of letters in the longest word: " + findTheLongestWord(input).length());
                System.out.println("Second word reversed: " + reverseLettersOfSecondWord(input));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
    private static String[] splitTheSentenceIntoWords(String sentence){
        String str = sentence.replace(",", "");
        String[] words = str.split(" ");
        return words;
    }

    private static String findTheLongestWord(String sentence){
        String[] words = splitTheSentenceIntoWords(sentence);
        if (words.length != 5) {
            System.out.println("Only 5 words expected");
        }
        String longestWord = words[0];
        for (int i = 0; i < 5; i++) {
            if (longestWord.length() < words[i].length()) {
                longestWord = words[i];
            }
        }
        return longestWord;
    }
    private static String reverseLettersOfSecondWord(String sentence) {
        String[] words = splitTheSentenceIntoWords(sentence);
        StringBuilder sb = new StringBuilder(words[1]);
        return  sb.reverse().toString();
    }


}

