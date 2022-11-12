// find the min and max in the array
//{2,3,5,1,7}
package RecurtionsQuestion;

import java.util.Arrays;
import java.util.Scanner;

public class findTheMinMax {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        for(int i=0; i< n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.print(arr[k]);
    }
}
