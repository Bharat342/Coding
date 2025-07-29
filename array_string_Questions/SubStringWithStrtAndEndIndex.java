package array_string_Questions;

import java.util.Scanner;

public class SubStringWithStrtAndEndIndex {
    static String substring(String s, int start_Index, int end_Index) {
        String result = "";
        for(int i=start_Index; i<end_Index; i++) {
            result += s.charAt(i);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        int start_Index = scan.nextInt();
        int end_Index = scan.nextInt();

        System.out.println(substring(s, start_Index, end_Index));
    }
}