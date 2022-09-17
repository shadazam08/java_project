// 3.  Write a program that creates integer array of N elements, accepts values of arrays and Find Sum, Average, Min, Max.
package Arrays;
import java.util.*;
public class arrays3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        float average = 0;
        int[] arr = new int[n];
        for(int i=0; i<=n-1; i++){
            arr[i] = sc.nextInt();
        }
        int min = arr[0];
        int max = arr[0];
        // for sum
        for(int i=0; i<=n-1; i++){
            sum += arr[i];
            average += arr[i];
            if(arr[i] < min){
                min = arr[i];
            }
            if(arr[i] > max){
                max = arr[i];
            }

        }
        average /= n;
        System.out.println("Sum = "+sum);
        System.out.printf("Average = %.2f\n", average);
        System.out.println("index of Min Value is = "+ min);
        System.out.println("Max = "+ max);
    }
}
