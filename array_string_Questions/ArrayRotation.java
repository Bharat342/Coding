package array_string_Questions;

import java.util.Scanner;

//input = [1,2,3,4,5,6,7], n = 7, k = 3
//output = [5,6,7,1,2,3,4] { (i + K) % n }

public class ArrayRotation {

    static void rotateArray(int[] nums, int k) {

        int[] arr = new int[nums.length];

        int temp = 0;
        for(int i=0; i<nums.length; i++) {
            temp = (i + k) % nums.length;
            arr[temp] = nums[i];
        }
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();

        int[] nums = new int[n];

        for(int i=0; i<nums.length; i++) {
            nums[i] = scan.nextInt();
        }
        rotateArray(nums, k);

    }
}
