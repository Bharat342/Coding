package array_string_Questions;

import java.util.Scanner;

public class ReverseArray {
    static void reverseArray(int[] arr) {
        int[] res = new int[arr.length];
        for(int i=0; i<res.length; i++) {
            res[(res.length-i)-1] = arr[i];
        }

        for(int i=0; i<res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);

       int n = scan.nextInt();

       int[] arr = new int[n];

       for(int i=0; i<arr.length; i++) {
           arr[i] = scan.nextInt();
       }
        reverseArray(arr);
    }
}
