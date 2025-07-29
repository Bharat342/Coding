package array_string_Questions;

import java.util.Scanner;

public class Suffle_The_Array {
    static int[] suffleArray(int[] arr, int k) {
        int[] a = new int[arr.length];
        int i=0, x =0, y =k;
        while(i<a.length) {
            a[i] = arr[x];
            i++;
            x++;
            a[i] = arr[y];
            i++;
            y++;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<arr.length; i++) {
            arr[i] = scan.nextInt();
        }

        int k = arr.length/2;
        arr = suffleArray(arr, k);

        for(int t=0; t<arr.length; t++) {
            System.out.print(arr[t] + " ");
        }
    }
}
