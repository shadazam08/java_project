//13. Write a program to create a single dimensional array of N integers. Print array element in a single line with one space between each element. Also print sum of elements present at even indexes and sum of elements present at odd indexes in array.
package Arrays;
import java.util.*;
public class arrays13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<=n-1; i++){
            arr[i]= sc.nextInt();
        }
        int evensum = 0, oddsum = 0;
        for(int i=0; i<=n-1; i++){
//            System.out.println();
            System.out.print("Index ="+i + " Element = " + arr[i]+" \t");
            if(i%2 == 0){
                evensum += arr[i];
            }else{
                oddsum += arr[i];
            }
        }
        System.out.println();
        System.out.println("Even Sum = " + evensum);
        System.out.println("Odd Sum = " + oddsum);
    }
}
