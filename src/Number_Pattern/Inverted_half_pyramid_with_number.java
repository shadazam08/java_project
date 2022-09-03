package Number_Pattern;
import java.util.*;
public class Inverted_half_pyramid_with_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // outer loop
        for(int i = n; i >= 1; i--){
            // inner loop
            for(int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
