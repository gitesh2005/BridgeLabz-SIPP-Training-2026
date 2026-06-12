package ProgrammingElements.Assessment.String.Level1;

public class NullPointerExceptionDemo {

    static void generateNullPointerException() {
        String text = null;

        System.out.println(text.length());
    }

    static void handleNullPointerException() {
        String text = null;

        try {
            System.out.println(text.length());
        }
        catch (NullPointerException e) {
            System.out.println("NullPointerException handled successfully.");
        }
    }

    public static void main(String[] args) {

        // First call this to generate the exception
        // generateNullPointerException();

        // Then call this to handle the exception
        handleNullPointerException();
    }
}