//9.  Write an array which takes in roll no and marks in 3 subjects for N students. Print the roll no, total marks and average for all students.
package Arrays;
import java.util.*;
public class arrays9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Size of class Student");
        int n = sc.nextInt();
        int[] roll = new int[n];
        int[] sub1 = new int[n];
        int[] sub2 = new int[n];
        int[] total = new int[n];
        int[] sub3 = new int[n];
        int[] sub4 = new int[n];
        int[] sub5 = new int[n];
        float[] average = new float[n];

        for(int i=0; i<=n-1; i++){
            System.out.print("Roll Number: ");
            roll[i] = sc.nextInt();
            System.out.print("Math marks: ");
            sub1[i] = sc.nextInt();
            System.out.print("Science marks: ");
            sub2[i] = sc.nextInt();
            System.out.print("English marks: ");
            sub3[i] = sc.nextInt();
            System.out.print("Social Science marks: ");
            sub4[i] = sc.nextInt();
            System.out.print("Hindi marks: ");
            sub5[i] = sc.nextInt();
            total[i] = sub1[i] + sub2[i] + sub3[i] +sub4[i] + sub5[i];
            average[i] = (float) (total[i] / 5);
        }
        for(int i=0; i<=n-1; i++){
            System.out.printf("Roll = "+roll[i] + "  Total = "+ total[i] +"  Average = "+ average[i]+ " \t" );
        }
    }
}
