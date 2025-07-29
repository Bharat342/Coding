package array_string_Questions;

import java.util.Scanner;
// revise the program again and again
public class SubStringsOfGivenString {
    static void substrings(String str) {
        int n = str.length();
        for(int i=0; i<n; i++) {
            for(int j=0; j<=n-i; j++) {
                for(int k=j; k<=(j+i)-1; k++) {
                    System.out.print(str.charAt(k));
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();

        substrings(str);
    }
}
