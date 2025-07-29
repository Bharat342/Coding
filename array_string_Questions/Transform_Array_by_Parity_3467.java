package array_string_Questions;

/*
You are given an integer array nums.
Transform nums by performing the following operations in the exact order specified:

Replace each even number with 0.
Replace each odd numbers with 1.
Sort the modified array in non-decreasing order.
Return the resulting array after performing these operations.

Example 1:

Input: nums = [4,3,2,1]

Output: [0,0,1,1]

Explanation:

Replace the even numbers (4 and 2) with 0 and the odd numbers (3 and 1) with 1. Now, nums = [0, 1, 0, 1].
After sorting nums in non-descending order, nums = [0, 0, 1, 1].
 */

import java.util.Scanner;

public class Transform_Array_by_Parity_3467 {

    public int[] transformArray(int[] nums) {

        int[] arr = new int[nums.length];

        // Replacing the number by 0 and 1
        for(int i=0; i<nums.length; i++) {
            if(nums[i] % 2 == 0) {
                arr[i] = 0;
            }else {
                arr[i] = 1;
            }
        }

        // Sorting the array
        for(int i=0; i<arr.length-1; i++) {
            for(int j=i+1; j<arr.length; j++) {
                if(arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the length of array :");
        int n = scan.nextInt();

        int[] nums = new int[n];
        for(int i=0; i<nums.length; i++) {
            nums[i] = scan.nextInt();
        }

        Transform_Array_by_Parity_3467 result = new Transform_Array_by_Parity_3467();
        nums = result.transformArray(nums);

        for(int a : nums) {
            System.out.print(a + " ");
        }
    }

}











