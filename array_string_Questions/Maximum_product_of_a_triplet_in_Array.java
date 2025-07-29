package array_string_Questions;

/*
Maximum product of a triplet (subsequence of size 3) in array
Last Updated : 12 Feb, 2025
Given an integer array, find a maximum product of a triplet in the array.

Examples:

Input:  arr[ ] = [10, 3, 5, 6, 20]
Output: 1200
Explanation: Multiplication of 10, 6 and 20


Input:  arr[ ] =  [-10, -3, -5, -6, -20]
Output: -90


Input: arr[ ] =  [1, -4, 3, -6, 7, 0]
Output: 168
 */
import java.util.Scanner;

public class Maximum_product_of_a_triplet_in_Array {
    public int product_of_triplet(int[] nums) {
        for(int i=0; i<nums.length-1; i++) {
            for(int j=i+1; j<nums.length; j++) {
                if(nums[i] > nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        int result = nums[nums.length-1] * nums[nums.length-2] * nums[nums.length-3];
        return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the size of an array :");
        int n = scan.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter the array values comma separated : ");
        for(int i=0; i<nums.length; i++) {
            nums[i] = scan.nextInt();
        }

        Maximum_product_of_a_triplet_in_Array result = new Maximum_product_of_a_triplet_in_Array();

        System.out.println(result.product_of_triplet(nums));
    }
}

















