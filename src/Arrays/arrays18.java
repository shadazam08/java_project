//18. Write a program which takes in 10 people’s age and gives no of people who are < 18, 18-60, >60
package Arrays;
import java.util.*;
public class arrays18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<=n-1; i++){
            arr[i] = sc.nextInt();
        }
        int count1=0, count2=0, count3=0;
        for(int i=0; i<=n-1; i++){
            if(arr[i] < 18){
                count1++;
            } else if (arr[i]>=18 && arr[i]<=60) {
                count2++;
            }else {
                count3++;
            }
        }
        System.out.println("Number Of below 18 age = "+ count1);
        System.out.println("Number Of Between 18  and 60 = "+ count2);
        System.out.println("Number Of Above 60 age = "+ count3);
    }
}
