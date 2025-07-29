import java.util.Scanner;

public class IsEquals {
    static Boolean isEquals(String s1, String s2) {

        if(s1.length() != s2.length()) {
            return false;
        } else {
            for(int i=0; i< s1.length(); i++) {
                if(s1.charAt(i) != s2.charAt(i)) {
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String s1 = scan.nextLine();
        String s2 = scan.nextLine();

        System.out.println(isEquals(s1, s2));
    }
}
