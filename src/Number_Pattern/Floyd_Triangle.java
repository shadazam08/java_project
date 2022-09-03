package Number_Pattern;
import java.util.*;
public class Floyd_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = 1;
        // outer loop
        for(int i = 1; i <= n; i++){
            // inner loop
            for(int j = 1; j <= i; j++){
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}
