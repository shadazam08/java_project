package test;
import java.util.*;
public class pairSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count =0;
        for(int i=0; i<n-1; i++){
            for(int j= i+1; j<n; j++){
                if(i+j == n){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
