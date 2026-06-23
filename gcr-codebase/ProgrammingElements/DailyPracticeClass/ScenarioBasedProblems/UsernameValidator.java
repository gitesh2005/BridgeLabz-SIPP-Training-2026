package ProgrammingElements.DailyPracticeClass.ScenarioBasedProblems;

import java.util.Scanner;

public class UsernameValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();



        char[] ch = str.toCharArray();

        int leng = ch.length;

        if(leng == 0){
            System.out.println("Please provide the valid name");
            return;
        }
        boolean space = false;
        for(int i = 0 ; i < ch.length ; i++){
            if(ch[i] == ' '){
                space = true;
                break;
            }
        }



        String ss = str.toUpperCase();

        if(!space){
            System.out.println("No  SPace is Present");
        }
        else{
            System.out.println("Yes space is present");
        }
        System.out.println("The Total number of Characters are : "+ leng);

        System.out.println("The uppercase is : "+ ss);


        int start = 0;
        int end = str.length() - 1;
        boolean palindrome = true;
        while (start < end){
            if(str.charAt(start) != str.charAt(end)){
                palindrome = false;
                break;
            }
            start++;
            end--;
        }

        if(palindrome){
            System.out.println("yes it is a palindrome");
        }
        else{
            System.out.println("NO it is not a palindrome");
        }
    }
}
