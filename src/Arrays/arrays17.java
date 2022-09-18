//17.Write a program to take in N values from user in a single dimensional array. Print only numbers which have 4 digits.
package Arrays;
import java.util.*;
public class arrays17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<=n-1; i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<=n-1; i++){
            if(arr[i] >=1000 && arr[i] <=9999){
                System.out.print(arr[i] + " ");
            }
        }
    }
}
