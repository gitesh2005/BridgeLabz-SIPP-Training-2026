package ProgrammingElements.Assessment.String.Level1;

import java.util.Scanner;

public class StringIndexOutOfBoundsExceptionDemo {

    static void generateException(String text) {
        System.out.println(text.charAt(text.length()));
    }

    static void handleException(String text) {
        try {
            System.out.println(text.charAt(text.length()));
        }
        catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException handled successfully.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.next();

        // First call this to generate the exception
        // generateException(text);

        // Then call this to handle the exception
        handleException(text);

        sc.close();
    }
}