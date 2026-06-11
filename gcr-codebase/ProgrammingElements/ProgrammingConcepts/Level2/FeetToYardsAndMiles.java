package ProgrammingElements.ProgrammingConcepts.Level2;

import java.util.Scanner;

public class FeetToYardsAndMiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double distanceInFeet = sc.nextDouble();

        double distanceInYards = distanceInFeet / 3;
        double distanceInMiles = distanceInYards / 1760;

        System.out.println("The distance in yards is " + distanceInYards + " and miles is " + distanceInMiles);
    }
}