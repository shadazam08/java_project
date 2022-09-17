package Arrays;
import java.util.Scanner;
public class alternationSwap { // {1 2 3 4 5} ans is {2 1 3 4 5}
    public static void swapNumber(int[] arr){
        int n = arr.length;
        int temp = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<n; j++){
//                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            System.out.print(temp + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        swapNumber(arr);
    }
}
