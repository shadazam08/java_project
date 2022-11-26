package ArenaQuestion.Strings;

import java.util.Scanner;

public class stringsDeclare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your First Name: ");
//        Concatenation
        String firstName = sc.nextLine();
        System.out.print("Enter Your Second Name: ");
        String secondName = sc.nextLine();
        String fullName = firstName +" " + secondName;
        System.out.println("Your Name is: " + fullName);
    }
}
