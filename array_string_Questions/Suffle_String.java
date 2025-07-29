package array_string_Questions;

import java.util.Scanner;

public class Suffle_String {
    static String suffleString(String s, int[] index) {
        char[] st = s.toCharArray();
        char[] temp = new char[st.length];
        for(int i=0; i<temp.length; i++) {
            temp[i] = st[index[i]];
        }
        s = new String(temp);
        return s;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String s = scan.next();
        int n = scan.nextInt();
        int[] index = new int[n];

        for(int i=0; i<index.length; i++) {
            index[i] = scan.nextInt();
        }
        System.out.println(suffleString(s, index));
    }
}
