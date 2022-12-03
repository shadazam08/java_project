package MockTestQuestions.Strings;

import java.util.Scanner;

public class reverseStrings4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] str1 = str.split("\\s");
        String str2 = "";
        for (int i=0; i< str1.length; i++){
            if(i == str1.length-1){
                str2 = str1[i] + str2;
            }else {
                str2 = " " + str1[i] + str2;
            }
        }
        System.out.print(str2);
    }
}
