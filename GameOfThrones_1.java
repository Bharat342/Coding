import java.util.Arrays;
import java.util.Scanner;

public class GameOfThrones_1 {
    static String  checkKey(String s) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        int i = 0, count = 0;
        while(i<arr.length) {
            if(i < arr.length-1 && arr[i] == arr[i+1]) {
                i += 2;
            }else {
                i++;
                count++;
            }
        }
        if(count <= 1) {
            return "Yes";
        }else {
            return "No";
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String s = scan.next();
        System.out.println(checkKey(s));
    }

}
