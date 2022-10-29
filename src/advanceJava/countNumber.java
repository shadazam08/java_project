package advanceJava;
import java.util.Scanner;
public class countNumber {
    public static int countNumbers(int n){
        if(n==0){
            return 1;
        }
        int i = 1;
        int ans = 10;
        int remainDegits = 9;
        int count = 9;
        while(i < n && remainDegits > 0 ){
            count *= remainDegits;
            ans += count;
            remainDegits--;
            i++;
        }
        return ans;

    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(countNumbers(n));
    }
}
