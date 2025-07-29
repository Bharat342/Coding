
import java.util.Scanner;

public class CountNoOfWords {
    static int countWords(String s) {
        int count = 0;
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == ' ') {
                count++;
            }
        }
        return count+1;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String s = scan.nextLine();

        System.out.println(countWords(s));
    }
}
