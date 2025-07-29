package array_string_Questions;

import java.util.Scanner;

public class ToUpperCaseAndLowerCase {
    static String toUpperCase(String s) {
        String newstr = "";
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                newstr += (char) (s.charAt(i) - 32);
                } else {
                newstr += s.charAt(i);
            }
        }
        return newstr;
    }

    static String toLowerCase(String s) {
        String newstr = "";
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                newstr += (char) (s.charAt(i) + 32);
                 } else {
                newstr += s.charAt(i);
            }
        }
        return newstr;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        System.out.println(toUpperCase(s));
        System.out.println(toLowerCase(s));
    }
}
