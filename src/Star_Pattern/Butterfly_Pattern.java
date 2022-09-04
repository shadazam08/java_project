package Star_Pattern;
import java.util.*;
public class Butterfly_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Upper Half
        for(int i= 1; i <= n; i++){
            // 1st part
            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for(int j = 1; j <= 2*(n-i); j++) {
                System.out.print("  ");
            }
            // 2nd part
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }

            System.out.println();
        }
        // Lower half
        for(int i= n; i >= 1; i--){
            // 1st part
            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for(int j = 1; j <= 2*(n-i); j++) {
                System.out.print("  ");
            }
            // 2nd part
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
