import java.util.Scanner;

public class CountVowelsInString {
    static int countVowels(String s) {
        int count = 0;
        for(int i=0; i<s.length(); i++) {
            char key = s.charAt(i);
            if(key == 'A' || key == 'E' || key == 'I' || key == 'O' || key == 'U'
            || key == 'a' || key == 'e' || key == 'i' || key == 'o' || key == 'u') {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String s = scan.nextLine();

        System.out.println(countVowels(s));
    }
}
