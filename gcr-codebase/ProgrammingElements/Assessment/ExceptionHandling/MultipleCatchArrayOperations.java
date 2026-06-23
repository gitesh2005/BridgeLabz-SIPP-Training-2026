package ProgrammingElements.Assessment.ExceptionHandling;

import java.util.Scanner;

public class MultipleCatchArrayOperations {
    public static int getValueAtIndex(int[] array, int index) {
        return array[index];
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Enter size of array: ");
            int size = input.nextInt();

            int[] array = new int[size];

            System.out.println("Enter array elements:");
            for (int i = 0; i < size; i++) {
                array[i] = input.nextInt();
            }

            System.out.print("Enter index number: ");
            int index = input.nextInt();

            int value = getValueAtIndex(array, index);
            System.out.println("Value at index " + index + ": " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index!");
        } catch (NullPointerException e) {
            System.out.println("Array is not initialized!");
        }

        input.close();
    }
}