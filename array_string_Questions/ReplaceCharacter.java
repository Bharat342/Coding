package array_string_Questions;

import java.util.Scanner;

public class ReplaceCharacter {
    static String replaceCharacter(String s, char temp1, char temp2) {
        String s1 = "";
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == temp1) {
                s1 += temp2;
            } else {
                s1 += s.charAt(i);
            }
        }
        return s1;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        char temp1 = scan.next().charAt(0);
        char temp2 = scan.next().charAt(0);
        System.out.println(replaceCharacter(s, temp1, temp2));
    }
}
