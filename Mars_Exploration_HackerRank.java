import java.util.Scanner;

public class Mars_Exploration_HackerRank {
    static int marsExploration(String s, String sig) {
       s = s.toUpperCase();
       int j=0,count=0;
       for(int i=0; i<s.length(); i++) {
           if(s.charAt(i) != sig.charAt(j)) {
               count++;
               if(j != sig.length()-1)
                   j++;
               else
                   j=0;
           }else {
               if(j != sig.length()-1)
                   j++;
               else
                   j=0;
           }
       }
       return count++;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String s = scan.next();
        String sig = "SOS";
        System.out.println(marsExploration(s, sig));
    }
}
