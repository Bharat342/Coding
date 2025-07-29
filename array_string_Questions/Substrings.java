package array_string_Questions;
// Question : Print all the Substring of length 3 of the given String
// intput --> "abcde"
// outpur --> abc bcd cde

import java.util.Scanner;

public class Substrings {
    static void printSubstring(String st, int len) {
        int n = st.length();
        for(int s=0; s<=n-len; s++) {
            for(int e=s; e<=(s+len)-1; e++) {
                System.out.print(st.charAt(e));
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String st = scan.nextLine();
        int len = scan.nextInt();
        printSubstring(st, len);
    }
}
