package ProgrammingElements.Assessment.Array.Level2;

import java.util.Scanner;

public class ReverseNumberUsingArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int tempNumber = number;
        int count = 0;

        while (tempNumber != 0) {
            count++;
            tempNumber = tempNumber / 10;
        }

        int[] digits = new int[count];

        tempNumber = number;

        for (int i = 0; i < digits.length; i++) {
            digits[i] = tempNumber % 10;
            tempNumber = tempNumber / 10;
        }

        int[] reverseDigits = new int[count];

        for (int i = 0; i < digits.length; i++) {
            reverseDigits[i] = digits[i];
        }

        System.out.print("Reverse number = ");

        for (int i = 0; i < reverseDigits.length; i++) {
            System.out.print(reverseDigits[i]);
        }

        sc.close();
    }
}