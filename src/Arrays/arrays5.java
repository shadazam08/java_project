//5.  Write a program that creates integer array of N elements, accepts values of arrays and Find sum of all Even numbers.
package Arrays;
import java.util.*;
public class arrays5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), sum = 0;
        int[] arr = new int[n];
        for(int i=0; i<=n-1; i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<=n-1; i++){
            if(arr[i]%2 == 0){
                sum += arr[i];
            }
        }
        System.out.println("Sum = "+sum);

    }
}
