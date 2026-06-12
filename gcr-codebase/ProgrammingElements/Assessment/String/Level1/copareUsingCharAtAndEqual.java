package ProgrammingElements.Assessment.String.Level1;

import java.time.chrono.IsoChronology;
import java.util.Scanner;

public class copareUsingCharAtAndEqual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.next();
        String s2 = sc.next();


        boolean CharAtEqual = true;


        if(s1.length() != s2.length()){
            CharAtEqual = false;
        }
        else {
            for (int i = 0; i < s1.length(); i++) {
                if (s1.charAt(i) != s2.charAt(i)){
                    CharAtEqual = false;
                    break;
                }
            }
        }

        boolean equalResult = s1.equals(s2);

        System.out.println("Result using CharAt : "+ CharAtEqual);
        System.out.println("Result using Equals: "+ equalResult);


    }
}
