package array_string_Questions;
/*
Input: nums = [2,1,3,5,6], k = 5, multiplier = 2

Output: [8,4,6,5,6]

 */
import java.util.Scanner;

public class LeetCodeArray_3264 {

    static int[] getFinalState(int[] nums, int k, int multiplier) {
        while(k != 0) {
            int min = nums[0];
            int index = 0;
            for(int i=0; i<nums.length; i++) {
                if(min > nums[i]) {
                    min = nums[i];
                    index = i;
                }
            }
            nums[index] = multiplier * min;
            k--;
        }
        return nums;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("enter the size of an Array : ");
        int n = scan.nextInt();

        System.out.println("enter the array values comma seperated : ");
        int[] nums = new int[n];
        for(int i=0; i<nums.length; i++) {
            nums[i] = scan.nextInt();
        }

        System.out.println("Enter the k value : ");
        int k = scan.nextInt();

        System.out.println("Enter the multiplayer value");
        int multiplier = scan.nextInt();

        int[] arr = getFinalState(nums, k, multiplier);

        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
