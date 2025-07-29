
import java.util.Arrays;
import java.util.Scanner;

public class Checking_Anagram_Strings {

    static boolean check_Aragram(String s1, String s2) {

        // Removing Special Character like ' ' etc.
        String temp = "";
        for(int i=0; i<s1.length(); i++) {
            if(s1.charAt(i) != ' ') {
                temp += s1.charAt(i);
            }
        }
        s1 = temp;
        temp = "";
        for(int i=0; i<s2.length(); i++) {
            if(s2.charAt(i) != ' ') {
                temp += s2.charAt(i);
            }
        }
        s2 = temp;

        //Making String to upper case

        s1 = s1.toUpperCase();
        s2 = s2.toUpperCase();

        //Converting String to Char[] to compare character by character
        char[] a1 = s1.toCharArray();
        char[] a2 = s2.toCharArray();

        //Sorting the char[]
        Arrays.sort(a1);
        Arrays.sort(a2);

        // Converting Character[] into String
        s1 = new String(a1);
        s2 = new String(a2);

//        Checking it equals or not
        /*
        if(s1.equalsIgnoreCase(s2)) {
            return true;
        } else {
            return false;
        }
         */
        return s1.equals(s2);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String s1 = scan.nextLine();
        String s2 = scan.nextLine();

        System.out.println(check_Aragram(s1, s2));

    }
}
