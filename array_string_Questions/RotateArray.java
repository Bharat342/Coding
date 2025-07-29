package array_string_Questions;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

//         Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
//        Input: nums = [1,2,3,4,5,6,7], k = 3
//        Output: [5,6,7,1,2,3,4]

import java.util.Scanner;

public class RotateArray {

   static void ArrayRotation(int a[], int k) {
       int arr[] = new int[a.length];

       int temp = 0;
       for(int i=0; i<a.length; i++) {
           temp = (i+k) % a.length ;
           arr[temp] = a[i];
       }
       for(int i=0; i<arr.length; i++) {
           System.out.print(arr[i] + " ");
       }
    }
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
            int k = scan.nextInt();

            int[] a = new int[n];

            for(int i=0; i<a.length; i++) {
                a[i] = scan.nextInt();
            }

            ArrayRotation(a, k);

    }

    /*
    public int[] rotateArray(int[] nums, int k) {
        int[] arr = new int[nums.length];
        for(int i=0; i<nums.length; i++) {
            int temp = (i + k) % nums.length;
            arr[temp] = nums[i]; // for reverse rotation (swap temp with i)
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the size of an Array : ");
        int n = scan.nextInt();

        System.out.println("Enter the value of K :");
        int k = scan.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter the value comma seperated : ");
        for(int i=0; i<nums.length; i++) {
            nums[i] = scan.nextInt();
        }

        Experiment experiment = new Experiment();
        nums = experiment.rotateArray(nums, k);

        for(int i : nums) {
            System.out.print(i + " ");
        }
    }
     */
}