// print x^n (stack height = logn)
package RecurtionsQuestion;

import java.util.Scanner;

public class powerXofN {
    public static int calculatePower(int x, int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        if(n % 2 == 0) {
            return calculatePower(x, n / 2) * calculatePower(x, n/2);
        }else {
            return calculatePower(x, n/2) * calculatePower(x, n/2) * x;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        int ans = calculatePower(x,n);
        System.out.println(ans);
    }
}
