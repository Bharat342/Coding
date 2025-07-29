import java.util.Scanner;

public class ReverseString {
    static String reverseString(String str) {
       /* String s = "";
        for(int i=str.length()-1; i>=0; i--) {
            s += str.charAt(i);
        }
        return s;*/
        int i =0, j=str.length()-1;
//       char[] s = new char[str.length()];
//       for(int i=0; i<s.length; i++) {
//           s[i] = str.charAt(i);
//       }
       char[] s = str.toCharArray();
       while(i<=j) {
           char temp = s[i];
           s[i] = s[j];
           s[j] = temp;
           i++;
           j--;
       }
       return str = new String(s);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String s = scan.nextLine();

         s = reverseString(s);
        System.out.println(s);
    }
}
