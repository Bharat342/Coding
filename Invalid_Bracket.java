import java.util.Scanner;

public class Invalid_Bracket {
    static String checkBracket(String s) {
        char open = 0, close = 0;
        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if(c == '(') {
                open++;
            } else if(c == ')') {
                close++;
            }
        }
        if(open == close) {
            return "Bracket Not Require";
        } else if(open > close){
            return (open - close) + " Open Bracket Require";
        } else {
            return (close - open) + " Close Bracket Require";
        }
    }
    public static void main(String... args) {
        Scanner scan = new Scanner(System.in);

        String s = scan.next();

        System.out.println(checkBracket(s));
    }
}
