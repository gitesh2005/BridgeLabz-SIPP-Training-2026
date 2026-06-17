package ProgrammingElements.DailyPracticeClass.ExceptionHandling;

public class arthematic {
    public static void main(String[] args) {
        int n = 10;


        try{
            int a = n/0;
            System.out.println(a);
        }
        catch (ArithmeticException b){
            System.out.println("You not divide a number by zero");
        }
    }
}
