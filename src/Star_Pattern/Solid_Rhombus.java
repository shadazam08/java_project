package Star_Pattern;
import java.util.*;
public class Solid_Rhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Outer Loop
        for(int i = 1; i <= n; i++){
            // inner loop
            for(int j = 1; j <= n-i; j++){
                System.out.print("  ");
            }
            for(int j = 1; j <= n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
