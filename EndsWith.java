import java.util.Scanner;

// this code not working for multiple test cases need to wotk on this code
public class EndsWith {
    static Boolean endsWith(String s, String key) {
        int count = 0;
        for(int i=s.length()-key.length()-1; i<=s.length()-1; i++) {
            if(key.charAt(count) == s.charAt(i)) {
                count++;
            }
        }
        if(key.length() == count) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String key = scan.nextLine();

        System.out.println(endsWith(s, key));
    }
}