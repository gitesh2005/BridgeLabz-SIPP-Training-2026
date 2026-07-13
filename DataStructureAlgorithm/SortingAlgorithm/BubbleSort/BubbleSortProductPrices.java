package SortingAlgorithm.BubbleSort;

import java.util.Scanner;

public class BubbleSortProductPrices {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of products: ");
        int n = sc.nextInt();

        int[] prices = new int[n];

        System.out.println("Enter product prices:");
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }

        // Bubble Sort
        for (int i = 0; i < n - 1; i++) {

            boolean swapped = false;

            for (int j = 0; j < n - i - 1; j++) {

                if (prices[j] > prices[j + 1]) {

                    int temp = prices[j];
                    prices[j] = prices[j + 1];
                    prices[j + 1] = temp;

                    swapped = true;
                }
            }

            // Stop if already sorted
            if (!swapped)
                break;
        }

        System.out.print("Sorted Product Prices: [");
        for (int i = 0; i < n; i++) {
            System.out.print(prices[i]);
            if (i != n - 1)
                System.out.print(", ");
        }
        System.out.println("]");

        sc.close();
    }
}