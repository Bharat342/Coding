import java.util.Scanner;
// complete this program
public class StrongPassword {
    static int checkPassword(String s) {
        int sc=1, num=1, lc=1, uc=1, count =0;
        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if(c >= '!' && c <= '+') {
                sc = 0;
                count++;
            } else if(c >= '0' && c <= '9'){
                num = 0;
                count++;
            } else if(c >= 'a' && c <= 'z') {
                lc = 0;
                count++;
            } else if((c >= 'A' && c <= 'Z')) {
                uc =0;
                count++;
            }
        }
        int sum = sc + num + lc + uc;
        if(sum > 6 - s.length()) {
            return sum;
        }else {
            return 6-s.length();
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        System.out.println(checkPassword(s));
    }
}
