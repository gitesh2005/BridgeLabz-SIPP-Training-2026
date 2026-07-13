package ProgrammingElements.Assessment.SortingAlgorithm;

import java.util.Scanner;

public class SelectionSortMovieRatings {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of movie ratings: ");
        int n = sc.nextInt();

        int[] ratings = new int[n];

        System.out.println("Enter the movie ratings:");
        for (int i = 0; i < n; i++) {
            ratings[i] = sc.nextInt();
        }

        // Selection Sort
        for (int i = 0; i < n - 1; i++) {

            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (ratings[j] < ratings[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap
            int temp = ratings[i];
            ratings[i] = ratings[minIndex];
            ratings[minIndex] = temp;
        }

        System.out.print("Sorted Movie Ratings: [");
        for (int i = 0; i < n; i++) {
            System.out.print(ratings[i]);
            if (i != n - 1)
                System.out.print(", ");
        }
        System.out.println("]");

        sc.close();
    }
}
