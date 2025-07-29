import java.util.Scanner;

public class FindIndexOfBasedOnOccurence {
    static int findIndex(String s, String t, int o) {
        char key = t.charAt(0);
        int position = 0;
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == key) {
               position++;
               if(position == o) {
                   return i;
               }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String t = scan.nextLine();
        int o = scan.nextInt();
        System.out.println(findIndex(s, t, o));
    }
}
