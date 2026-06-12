package ProgrammingElements.DailyPracticeClass;

import java.net.Inet4Address;
import java.util.Scanner;

public class WareHouseStore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i= 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        int TotalStock = 0;

        for (int i  = 0 ; i < n ; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }

        for (int i = 0 ; i < n ; i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }

        for(int i = 0 ; i < n ; i++){
            TotalStock += arr[i];
        }

        System.out.println(max);
        System.out.println(min);
        System.out.println(TotalStock);
    }
}
