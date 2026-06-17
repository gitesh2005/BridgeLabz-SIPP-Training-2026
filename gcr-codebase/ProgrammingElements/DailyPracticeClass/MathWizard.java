package ProgrammingElements.DailyPracticeClass;

import java.util.Scanner;

public class MathWizard {


    public static boolean isPrime(int n){

        boolean isPrimeNumber = true;
        if(n <=1 ){
           isPrimeNumber = false;
        }
        else{
            for (int i = 2 ; i  * i <= n ; i++){
                if(n % i == 0){
                    isPrimeNumber = false;
                    break;
                }
            }
        }
        return  isPrimeNumber;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(isPrime(n));
    }
}
