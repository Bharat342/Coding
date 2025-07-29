import java.util.Scanner;

public class Demo12 {
    static boolean checkTwoString(String[] word1, String[] word2, int n) {
        String s1="", s2="";
        int i=0;
           while(i != 1) {
               s1 = word1[i]+word1[i+1];
               s2 = word2[i]+word2[i+1];
               i++;
           }
       if(s1.equals(s2)) {
           return true;
       } else {
           return false;
       }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        String[] word1 = new String[n];
        String[] word2 = new String[n];

        for(int i=0; i<word1.length; i++) {
            word1[i] = scan.next();
        }
        for(int i=0; i<word2.length; i++) {
            word2[i] = scan.next();
        }

        System.out.println(checkTwoString(word1, word2, n));
    }
}
