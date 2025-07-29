package array_string_Questions;

import java.util.Scanner;

public class FindMInMaxInArray {
    static void findMinMax(int[] arr) {
        int min =arr[0];
        for(int i=0; i<arr.length; i++) {
            if(arr[i] <= min) {
                min = arr[i];
            }
        }
        System.out.println(min);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++) {
            arr[i] = scan.nextInt();
        }

        findMinMax(arr);
    }
}
