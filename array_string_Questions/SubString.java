package array_string_Questions;

import java.util.Scanner;

public class SubString {
    static String substring(String s, int startIndex) {
        String result = "";
        for(int i=startIndex; i<s.length(); i++) {
            result += s.charAt(i);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        int startIndex = scan.nextInt();

        System.out.println(substring(s, startIndex));
    }
}
