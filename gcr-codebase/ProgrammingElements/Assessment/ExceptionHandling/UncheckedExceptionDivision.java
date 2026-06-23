package ProgrammingElements.Assessment.ExceptionHandling;
import java.util.InputMismatchException;
import java.util.Scanner;

public class UncheckedExceptionDivision {
    public static int divideNumbers(int numerator, int denominator) {
        return numerator / denominator;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Enter first number: ");
            int number1 = input.nextInt();

            System.out.print("Enter second number: ");
            int number2 = input.nextInt();

            int result = divideNumbers(number1, number2);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        } catch (InputMismatchException e) {
            System.out.println("Please enter numeric values only");
        }

        input.close();
    }
}