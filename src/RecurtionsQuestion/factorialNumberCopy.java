package RecurtionsQuestion;

import java.util.Scanner;

public class factorialNumberCopy {
    public static int calculateFactorial(int n){
      if(n==1 || n==0){
          return 1;
      }
      int fact_num1 = calculateFactorial(n-1);
      return n * fact_num1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(calculateFactorial(n));
    }
}
