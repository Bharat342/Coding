import java.util.Scanner;

public class IsContain {
    static Boolean isContatin(String s, String t) {
        int count = 0;

        for(int i=0; i<s.length() && count<t.length(); i++) {
            if(s.charAt(i) == t.charAt(count)) {
                count++;
            } else {
                count = 0;
            }
        }
        if(count == t.length()) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String s = scan.nextLine();
        String t = scan.nextLine();

        System.out.println(isContatin(s, t));
    }
}
