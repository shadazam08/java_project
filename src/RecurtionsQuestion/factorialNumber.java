package RecurtionsQuestion;

import java.util.Scanner;

public class factorialNumber {
    public static int fact(int n){
        if(n==1 || n==0){
            return 1;
        }
        int fact_num1 = fact(n-1);
        return n * fact_num1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fact(n));
    }
}
