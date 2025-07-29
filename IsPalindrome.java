import java.util.Scanner;

public class IsPalindrome {
    static Boolean isPalindrom(String s) {

       int i=0;
       int j=s.length()-1;
       while(i <= j) {
           if(s.charAt(i) != s.charAt(j)) {
               return false;
           } else {
               i++;
               j--;
           }
       }
       return true;


        /*ReverseString rs = new ReverseString();
        String result = rs.reverseString(s);
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) != result.charAt(i)) {
                return false;
            }
        }
        return true;*/

//        if(s.equals(result)) {
//            return true;
//        }
//        return false;

    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String s = scan.nextLine();

        System.out.println(isPalindrom(s));
    }
}
