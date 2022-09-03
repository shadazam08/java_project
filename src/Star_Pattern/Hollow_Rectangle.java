package Star_Pattern;

import java.util.*;

public class Hollow_Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // outer loop
        for(int i = 1; i <= n; i++){
            // inner loop
            for(int j = 1; j <= n; j++){
                // check conditon
                if(i == 1 || j == 1 || i == n || j == n){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
