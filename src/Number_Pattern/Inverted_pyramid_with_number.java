package Number_Pattern;
import java.util.*;
public class Inverted_pyramid_with_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = n; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            for(int j = 1; j <= n-i; j++){
                System.out.print("X X ");
            }
            for(int j = i; j >=1; j--){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
