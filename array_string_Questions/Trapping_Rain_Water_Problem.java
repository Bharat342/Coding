package array_string_Questions;

import java.util.Scanner;

/*
Trapping Rain Water Problem

Trapping Rainwater Problem states that given an array of n non-negative
integers arr[] representing an elevation map
where the width of each bar is 1, compute how much water it can trap after rain.

Examples:

Input: arr[] = [3 0 1 0 4 0 2]
Output: 10
Explanation: The expected rainwater to be trapped is shown in the above image.


Input: arr[] = [3 0 2 0 4]
Output: 7
Explanation: We trap 0 + 3 + 1 + 3 + 0 = 7 units.


Input: arr[] = [1 2 3 4]
Output: 0
Explanation: We cannot trap water as there is no height bound on both sides
 */
public class Trapping_Rain_Water_Problem {

    public boolean checkAscDsc(int[] arr) {
        int plus = 0;
        int minus = arr.length-1;
        for(int i=0; i<arr.length-1; i++) {
            if(arr[i] >= arr[i+1]) {
                plus++;
                if(plus == arr.length-1) {
                    return false;
                }
            }else {
                minus--;
                if(minus==0) {
                    return false;
                }
            }
        }
        return true;
    }
    public int trapWaterResult(int[] nums) {
        int result = 0;
        int len = nums.length-1;
        if(checkAscDsc(nums)) {
            for(int i=0; i<nums.length-1; i++) {
                for(int j=i+1; j<nums.length; j++) {
                    if(nums[i] > nums[j]) {
                        result += nums[j];
                    }else {
                        result += nums[i];
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the size of an Array :");
        int n = scan.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter the value comma seperated : ");
        for(int i=0; i<nums.length; i++) {
            nums[i] = scan.nextInt();
        }

        Trapping_Rain_Water_Problem trapWater = new Trapping_Rain_Water_Problem();

        System.out.println(trapWater.trapWaterResult(nums));

    }
}

















