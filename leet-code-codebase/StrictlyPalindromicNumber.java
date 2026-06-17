import java.awt.desktop.ScreenSleepEvent;
import java.util.Scanner;

public class StrictlyPalindromicNumber {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();

            boolean answer = isStrictlyPalindromic(n);

            System.out.println(answer);
        }

        public static boolean isStrictlyPalindromic(int n) {

            for (int base = 2; base <= n - 2; base++) {

                String convertedNumber = convertToBase(n, base);

                System.out.println("Base " + base + " = " + convertedNumber);

                if (!isPalindrome(convertedNumber)) {
                    return false;
                }
            }

            return true;
        }

        public static String convertToBase(int n, int base) {

            StringBuilder storageBox = new StringBuilder();

            while (n > 0) {
                int remainder = n % base;
                storageBox.append(remainder);
                n = n / base;
            }

            return storageBox.reverse().toString();
        }

        public static boolean isPalindrome(String value) {

            int left = 0;
            int right = value.length() - 1;

            while (left < right) {

                if (value.charAt(left) != value.charAt(right)) {
                    return false;
                }

                left++;
                right--;
            }

            return true;
        }
    }
