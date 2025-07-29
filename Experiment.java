
import java.util.Scanner;

public class Experiment {
    public int[] rotateArray(int[] nums, int k) {
        int[] arr = new int[nums.length];
        for(int i=0; i<nums.length; i++) {
            int temp = (i + k) % nums.length;
            arr[temp] = nums[i];
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
}

// did you know now how methods are importents
//I have to study about methods
        //can we create an instance of outer class inside a static inner class ?

// inner class in so confusing we need to study about it perfectly

// can a constructor be final/ static or abstract ?
//you only explain
//becouse constructer is use for inisializastion
// not a perfect answer
// final : means can not be override why because constructor is  a specilized method
// static : means object cant be created but const used to create object
// abstract : means incomplete method but const.. is used to initialised object it cant be incomplete

/*
type of classes in java :
  concrete / complete
  abstract
  final
  static
  local
  inner / nested
  singleton
  anonymous
 */

// can we declare a class as private (class can be public or default)
// but we can declare class as private or anything if it is nested / inner

