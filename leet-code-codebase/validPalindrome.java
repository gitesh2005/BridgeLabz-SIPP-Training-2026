import java.util.Scanner;

public class validPalindrome {
    public static void main(String[] args) {
        Scanner sc =  new Scanner (System.in);

        String s = sc.nextLine();



        s = s.replaceAll("[^a-zA-Z0-9]", "");

        s = s.toLowerCase();

        StringBuilder sb  = new StringBuilder(s);


        sb = sb.reverse();

        System.out.println(sb);

        String ss = sb.toString();
        System.out.println(ss);
        if(sb.toString().equals(s)){
            System.out.println(true);
            return;
        }

        System.out.println(false);


    }
}
