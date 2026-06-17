package ProgrammingElements.Assessment.Recursion;

public class ReverseString {
    public static String reverse(String str) {
        if (str.length() == 0) {
            return "";
        }

        return reverse(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        String str = "hello";
        System.out.println(reverse(str));
    }
}