package ProgrammingElements.DailyPracticeClass.ExceptionHandling;

public class ThrowException {
    public static void main(String[] args) {
        int n = 10;

        if(n < 18){
            throw new ArithmeticException("Not eligible to vote");
        }
        System.out.println("Eligible to vote");
    }
}
