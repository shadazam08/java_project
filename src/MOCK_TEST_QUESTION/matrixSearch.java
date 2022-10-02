package MOCK_TEST_QUESTION;
import java.util.Scanner;
public class matrixSearch {
    static int matrixSearchs(int[][] arr, int n, int k){
        if(n==0){
            return -1;
        }
        for(int i=0; i<n; i++){
            for(int j=0;j<n; j++){
                if(arr[i][j] == k){
                    System.out.println(i +" "+ j);
                    return 1;
                }
            }
        }
        System.out.println("Element Not Found");
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int k = sc.nextInt();
        int[][] arr = new int[s][s];
        for(int i=0; i<s; i++){
            for(int j=0; j<s; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        matrixSearchs(arr, s, k);
    }
}
