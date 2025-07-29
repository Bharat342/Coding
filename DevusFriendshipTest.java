
import java.util.Scanner;

public class DevusFriendshipTest {

    static int[] sortArray(int[] arr) {
        int temp = 0;
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr.length; j++) {
                if(arr[i] <= arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        return arr;
    }

    static int testFriendship(int[] a) {
        int count = 0;
        for(int i=0; i<a.length-1; i++) {
            if(a[i] != a[i+1]) {
                count++;
            }
        }
        return count+1;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] a = new int[n];

        for(int i=0; i<a.length; i++) {
            a[i] = scan.nextInt();
        }

       System.out.println( testFriendship(sortArray(a)));

    }
}
