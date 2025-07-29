package array_string_Questions;

import java.util.Scanner;

public class Repeated_String_Problem {

    // This is sir Solution to the problem
    static int checkRepeatStr(String s, int n, char key) {
        int count = 0;
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == key) {
                count++;
            }
        }

        int count1 = n / s.length() * count;
        int count2 = 0;
        for(int i=0; i<n%s.length(); i++) {
            if(s.charAt(i) == key) {
                count2++;
            }
        }
        return count1+count2;

    // This is my Solution to the problem
   /* static int checkRepeatStr(String s, int n, char key) {
        String str = "";
        int i=0, insert_n=0, key_count=0;
       while(i < n) {
            if(insert_n < s.length()) {
               if(s.charAt(insert_n) == key) {
                   str += s.charAt(insert_n);
                   key_count++;
                   insert_n++;
                   i++;
               } else{
                   str += s.charAt(insert_n);
                   insert_n++;
                   i++;
               }
            } else {
                insert_n = 0;
            }
            if(n == i) {
                return key_count;
            }
       }
       return -1; */
    }
    public static void main(String... args) {
        Scanner scan = new Scanner(System.in);

        String s = scan.nextLine();
        int n = scan.nextInt();
        char key = scan.next().charAt(0);
        System.out.println(checkRepeatStr(s, n, key));
    }
}
