package MockTestQuestions.Strings;

import java.util.Scanner;

public class reverseString6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] str1 = str.split("\\s");
        String newString = "";
        for(int i=0; i<str1.length; i++){
            if(i == str1.length-1){
                newString = str1[i] + newString;
            }else {
                newString = " " + str1[i] + newString;
            }
        }
        System.out.println(newString);
    }
}
