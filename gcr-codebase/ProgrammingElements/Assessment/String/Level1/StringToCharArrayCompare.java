package ProgrammingElements.Assessment.String.Level1;

import java.util.Scanner;

public class StringToCharArrayCompare {

    static char[] getCharacters(String text) {
        char[] characters = new char[text.length()];

        for (int i = 0; i < text.length(); i++) {
            characters[i] = text.charAt(i);
        }

        return characters;
    }

    static boolean compareCharArrays(char[] first, char[] second) {
        if (first.length != second.length) {
            return false;
        }

        for (int i = 0; i < first.length; i++) {
            if (first[i] != second[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.next();

        char[] userDefinedArray = getCharacters(text);

        char[] builtInArray = text.toCharArray();

        boolean result = compareCharArrays(userDefinedArray, builtInArray);

        System.out.println("Characters using user-defined method:");

        for (int i = 0; i < userDefinedArray.length; i++) {
            System.out.println(userDefinedArray[i]);
        }

        System.out.println("Characters using built-in toCharArray():");

        for (int i = 0; i < builtInArray.length; i++) {
            System.out.println(builtInArray[i]);
        }

        System.out.println("Both character arrays are same: " + result);

        sc.close();
    }
}