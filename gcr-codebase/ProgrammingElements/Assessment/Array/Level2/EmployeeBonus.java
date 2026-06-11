package ProgrammingElements.Assessment.Array.Level2;

import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] salary = new double[10];
        double[] yearsOfService = new double[10];
        double[] bonusAmount = new double[10];
        double[] newSalary = new double[10];

        double totalBonus = 0.0;
        double totalOldSalary = 0.0;
        double totalNewSalary = 0.0;

        for (int i = 0; i < salary.length; i++) {
            System.out.print("Enter salary of employee " + (i + 1) + ": ");
            salary[i] = sc.nextDouble();

            System.out.print("Enter years of service of employee " + (i + 1) + ": ");
            yearsOfService[i] = sc.nextDouble();

            if (salary[i] <= 0 || yearsOfService[i] < 0) {
                System.out.println("Invalid input. Please enter again.");
                i--;
            }
        }

        for (int i = 0; i < salary.length; i++) {
            if (yearsOfService[i] > 5) {
                bonusAmount[i] = salary[i] * 0.05;
            }
            else {
                bonusAmount[i] = salary[i] * 0.02;
            }

            newSalary[i] = salary[i] + bonusAmount[i];

            totalBonus = totalBonus + bonusAmount[i];
            totalOldSalary = totalOldSalary + salary[i];
            totalNewSalary = totalNewSalary + newSalary[i];

            System.out.println("Employee " + (i + 1));
            System.out.println("Old Salary = " + salary[i]);
            System.out.println("Bonus Amount = " + bonusAmount[i]);
            System.out.println("New Salary = " + newSalary[i]);
        }

        System.out.println("Total Bonus Payout = " + totalBonus);
        System.out.println("Total Old Salary = " + totalOldSalary);
        System.out.println("Total New Salary = " + totalNewSalary);

        sc.close();
    }
}