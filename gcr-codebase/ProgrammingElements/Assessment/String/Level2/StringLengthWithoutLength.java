package ProgrammingElements.Assessment.String.Level2;

import java.util.Scanner;

public class StringLengthWithoutLength {

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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.next();

        int userDefinedLength = findLength(text);
        int builtInLength = text.length();

        System.out.println("Length using user-defined method = " + userDefinedLength);
        System.out.println("Length using built-in length() = " + builtInLength);

        sc.close();
    }
}