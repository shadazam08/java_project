//4.  Write a program that creates integer array of N elements, accepts values of arrays and Print only even numbers in the array.
package Arrays;
import java.util.*;
public class arrays4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<=n-1; i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<=n-1; i++){
            if(arr[i]%2 == 0){
                System.out.print(arr[i] + " ");
            }
        }
    }
}
