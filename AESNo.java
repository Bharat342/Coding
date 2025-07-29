
import java.util.Scanner;

public class AESNo {
    static boolean isAESNo(int n) {
        int count = 0;
        for(int i=1; i<=n; i++) {
            if(n%i == 0) {
                count++;
            }
        }
        if(count >= 4) {
            return true;
        }else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int l = scan.nextInt();
        int r = scan.nextInt();

        int res = 0;
        for(int i=0; i<=r; i++) {
            if(isAESNo(i) == true) {
                res++;
            }
        }
        System.out.println(res);
    }
}