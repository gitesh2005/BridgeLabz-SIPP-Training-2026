package ProgrammingElements.Assessment.String.Level2;

import java.util.Scanner;

public class WordsWithLength {

    static int findLength(String text) {
        int count = 0;

        while (true) {
            try {
                text.charAt(count);
                count++;
            }
            catch (StringIndexOutOfBoundsException e) {
                break;
            }
        }

        return count;
    }

    static String[] splitWords(String text) {
        int length = findLength(text);
        int wordCount = 1;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        int[] spaceIndexes = new int[wordCount + 1];

        spaceIndexes[0] = -1;
        int spaceCounter = 1;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[spaceCounter] = i;
                spaceCounter++;
            }
        }

        spaceIndexes[spaceCounter] = length;

        String[] words = new String[wordCount];

        for (int i = 0; i < wordCount; i++) {
            String word = "";

            for (int j = spaceIndexes[i] + 1; j < spaceIndexes[i + 1]; j++) {
                word = word + text.charAt(j);
            }

            words[i] = word;
        }

        return words;
    }

    static String[][] getWordLengthArray(String[] words) {
        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] words = splitWords(text);
        String[][] wordLengthArray = getWordLengthArray(words);

        System.out.println("Word\tLength");

        for (int i = 0; i < wordLengthArray.length; i++) {
            String word = wordLengthArray[i][0];
            int length = Integer.parseInt(wordLengthArray[i][1]);

            System.out.println(word + "\t" + length);
        }

        sc.close();
    }
}