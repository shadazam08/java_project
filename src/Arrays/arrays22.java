//22. Given an array of N integers, check if it contains any negative integer. Print "Yes" if the array contains any negative integer else print "No".
package Arrays;
import java.util.*;
public class arrays22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<=n-1; i++){
            arr[i] = sc.nextInt();
        }
        int temp = 0;
        for(int i=0; i<=n-1; i++){
            if(arr[i] < 0){
                temp++;
                break;
            }
        }
//        System.out.println(temp);
        if(temp <= 0){
            System.out.print("No");
        }else{
            System.out.print("Yes");
        }
    }
}
