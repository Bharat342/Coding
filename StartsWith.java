import java.util.Scanner;
// this code not working for multiple test cases need to wotk on this code
public class StartsWith {
    static Boolean startsWith(String s, String key) {
        for(int i=0; i<key.length(); i++) {
            if(key.charAt(i) != s.charAt(i)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String key = scan.nextLine();

        System.out.println(startsWith(s, key));
    }
}
