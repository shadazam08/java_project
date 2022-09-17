//7.  Write a program that creates integer array of N elements, accepts values of arrays and Search for a number in an array of K
package Arrays;
import java.util.*;
public class arrays7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<=n-1; i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int j;
        int index = 0;
        for(j = 0; j<=n; j++){
            if(arr[j] == k){
                index = 1;
            }else{
                index = 0;
            }
            break;
        }
        if(index == 1){
            System.out.println("Element Found at index Number is = "+ j+1);
        }else{
            System.out.println("Element not Found");
        }
    }
}
