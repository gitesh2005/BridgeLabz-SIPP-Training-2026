package ProgrammingElements.DailyPracticeClass;

import java.util.Scanner;

public class MetroCardSmartFairDeduction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter smart card balance: ");
        int balance = sc.nextInt();

        while (balance > 0) {

            System.out.print("Enter distance in km: ");
            int distance = sc.nextInt();

            int fare = (distance <= 2) ? 10 :
                        (distance <= 5) ? 20 :
                            (distance <= 12) ? 30 :
                                    (distance <= 21) ? 40 :
                                            (distance <= 32) ? 50 : 60;

            if (fare > balance) {
                System.out.println("Insufficient balance");
                System.out.println("Current balance: " + balance);
                break;
            }

            balance = balance - fare;

            System.out.println("Distance: " + distance + " km");
            System.out.println("Fare deducted: " + fare);
            System.out.println("Remaining balance: " + balance);

            if (balance == 0) {
                System.out.println("Balance exhausted");
                break;
            }

            System.out.print("Do you want to continue? yes/no: ");
            String choice = sc.next();

            if (choice.equalsIgnoreCase("no")) {
                System.out.println("User quit");
                break;
            }
        }

        System.out.println("Final balance: " + balance);

        sc.close();
    }
}