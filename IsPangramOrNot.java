
//Checking Weather a given string pangram or not
//pangram(string shoul contain all english alphabet form a - z)

import java.util.Scanner;

public class IsPangramOrNot {
    static boolean isPangram(String s) {
        char[] list = new char[26];
        int w=0, count=65;
        while(w<26) {
            list[w] = (char)count;
            w++;
            count++;
        }
        count=0;
        s = s.toUpperCase();
        String t = new String(list);

        // check the condition t.charAt(i) giving us 'A'
        // s.index() giving us the index number if there is a character or it will give us -1
        for(int i=0; i<t.length(); i++) {
            if(s.indexOf(t.charAt(i)) >= 0) {
                count++;
            }else {
                return false;
                // break
                // --> break also we can use here
            }
        }
        // return if the count == 26 else it weill give use false
        return (count == 26);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String s = scan.nextLine();

        System.out.println(isPangram(s));
    }
}
