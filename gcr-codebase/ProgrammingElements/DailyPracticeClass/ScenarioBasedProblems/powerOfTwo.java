package ProgrammingElements.DailyPracticeClass.ScenarioBasedProblems;

import java.util.Scanner;
// using the Loop but gives TLE --> soo for this we use the recursion....
public class powerOfTwo {
    public static boolean  isPowerOfTwo(int n) {

        if(n == 1){
            return true;
        }

        if(n > 1){
            for(int i = 0 ; i < n ; i++){
                int numb = (int)Math.pow(2,i);

                if(numb == n){
                    return true;
                }
            }
        }
        return false;

    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isPowerOfTwo(n));
    }
}
