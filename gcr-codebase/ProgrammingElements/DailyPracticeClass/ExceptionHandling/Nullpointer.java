package ProgrammingElements.DailyPracticeClass.ExceptionHandling;

public class Nullpointer {


    public static void main(String[] args) {
        String s = null;


        try{
            int len  = s.length();
            System.out.println(len);
        }
        catch (NullPointerException n){
            System.out.println("Your string is invalid NullPointer exception is come ");
        }
    }
}
