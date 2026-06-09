import java.util.*;

public class FizzBuzz412 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> lst = new ArrayList<>();

        int n = sc.nextInt();

        for(int i = 1 ; i <= n ; i++){
            if(i % 3 == 0 && i % 5 == 0){
                lst.add("FizzBuzz");
            } else if (i % 3 == 0) {
                lst.add("Fizz");
            } else if (i % 5 == 0) {
                lst.add("Buzz");
            }
            else{
                lst.add(String.valueOf(i));
            }
        }
        System.out.println(lst);
    }
}