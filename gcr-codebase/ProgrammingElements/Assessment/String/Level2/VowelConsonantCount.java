package ProgrammingElements.Assessment.String.Level2;

import java.util.Scanner;

public class VowelConsonantCount {

    static String checkCharacter(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32);
        }

        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            }
            else {
                return "Consonant";
            }
        }

        return "Not a Letter";
    }

    static int[] countVowelsAndConsonants(String text) {
        int[] count = new int[2];

        for (int i = 0; i < text.length(); i++) {
            String result = checkCharacter(text.charAt(i));

            if (result.equals("Vowel")) {
                count[0]++;
            }
            else if (result.equals("Consonant")) {
                count[1]++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        int[] result = countVowelsAndConsonants(text);

        System.out.println("Vowel count = " + result[0]);
        System.out.println("Consonant count = " + result[1]);

        sc.close();
    }
}