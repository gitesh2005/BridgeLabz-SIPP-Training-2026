package ProgrammingElements.Assessment.Methods;

import java.util.Scanner;

public class TriangularParkRun {
    public static double calculateRounds(double side1, double side2, double side3) {
        double perimeter = side1 + side2 + side3;
        return 5000 / perimeter;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first side of triangle in meters: ");
        double side1 = input.nextDouble();

        System.out.print("Enter second side of triangle in meters: ");
        double side2 = input.nextDouble();

        System.out.print("Enter third side of triangle in meters: ");
        double side3 = input.nextDouble();

        double rounds = calculateRounds(side1, side2, side3);

        System.out.println("The athlete needs to complete " + rounds + " rounds to complete 5 km");

        input.close();
    }
}