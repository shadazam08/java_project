//10. Write a program to take in 10 values and print only those nos which are prime.
package Arrays;
import  java.util.*;
public class arrays10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<=n-1; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<=n-1; i++){
            int p=1;
            int j = 2;
            while(j < arr[i]){
                if(arr[i] % j == 0){
                    p=0;
                    break;
                }
                j++;
            }
            if(p==1){
                System.out.print(arr[i] + " ");
            }
        }
    }
}
