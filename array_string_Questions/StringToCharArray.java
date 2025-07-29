package array_string_Questions;

import java.util.Scanner;

public class StringToCharArray {
    static char[] toCharArray(String s) {
        char[] arr = new char[s.length()];
        for(int i=0; i<arr.length; i++) {
            arr[i] = s.charAt(i);
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String s = scan.nextLine();

        char[] res = toCharArray(s);

        for(int i=0; i<res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }
}
