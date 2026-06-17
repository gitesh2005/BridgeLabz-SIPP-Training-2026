package ProgrammingElements.DailyPracticeClass;

import java.util.Scanner;

public class isPOWEROFTwo {

    public static  boolean isPowerTwo(int n){

        if(n == 1){
            return true;
        }
        if (n <= 0 || n % 2 != 0){
            return  false;
        }

        return isPowerTwo(n/2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  n = sc.nextInt();

        System.out.println(isPowerTwo(n));

    }
}
