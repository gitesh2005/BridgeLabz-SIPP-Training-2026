package ProgrammingElements.Assessment.String.Level2;

import java.util.Scanner;

public class SplitTextCompare {

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

    static boolean compareStringArrays(String[] first, String[] second) {
        if (first.length != second.length) {
            return false;
        }

        for (int i = 0; i < first.length; i++) {
            if (!first[i].equals(second[i])) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] userDefinedWords = splitWords(text);
        String[] builtInWords = text.split(" ");

        boolean result = compareStringArrays(userDefinedWords, builtInWords);

        System.out.println("Words using user-defined method:");
        for (int i = 0; i < userDefinedWords.length; i++) {
            System.out.println(userDefinedWords[i]);
        }

        System.out.println("Words using built-in split() method:");
        for (int i = 0; i < builtInWords.length; i++) {
            System.out.println(builtInWords[i]);
        }

        System.out.println("Both arrays are same: " + result);

        sc.close();
    }
}