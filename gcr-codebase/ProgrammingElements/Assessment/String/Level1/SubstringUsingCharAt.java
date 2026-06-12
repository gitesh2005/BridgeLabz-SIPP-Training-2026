package ProgrammingElements.Assessment.String.Level1;

import java.util.Scanner;

public class SubstringUsingCharAt {

    static String createSubstring(String text, int start, int end) {
        String result = "";

        for (int i = start; i < end; i++) {
            result = result + text.charAt(i);
        }

        return result;
    }

    static boolean compareStrings(String first, String second) {
        if (first.length() != second.length()) {
            return false;
        }

        for (int i = 0; i < first.length(); i++) {
            if (first.charAt(i) != second.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.next();

        System.out.print("Enter start index: ");
        int start = sc.nextInt();

        System.out.print("Enter end index: ");
        int end = sc.nextInt();

        String charAtSubstring = createSubstring(text, start, end);

        String builtInSubstring = text.substring(start, end);

        boolean result = compareStrings(charAtSubstring, builtInSubstring);

        System.out.println("Substring using charAt() = " + charAtSubstring);
        System.out.println("Substring using built-in substring() = " + builtInSubstring);
        System.out.println("Both substrings are same: " + result);

        sc.close();
    }
}