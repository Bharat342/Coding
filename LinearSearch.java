
import java.util.Scanner;

public class LinearSearch {

    static int searchElement(int[] nums, int target) {
        if(nums.length == 0) {
            return -1;
        }

        for(int i=1; i<nums.length; i++) {
            int element = nums[i];
            if(element == target) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of an Array : ");
        int n = scan.nextInt();

        int[] nums = new int[n];
        System.out.println("enter the array elements comma seperated : ");
        for(int i=0; i<nums.length; i++) {
            nums[i] = scan.nextInt();
        }

        System.out.println("enter the target :");
        int target = scan.nextInt();

        int index = searchElement(nums, target);
        System.out.println(index);
    }
}
