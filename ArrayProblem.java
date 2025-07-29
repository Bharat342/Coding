
import java.util.Scanner;

public class ArrayProblem {
   static void findDuplicates(int[] arr) {
       int[] duplicate = new int[arr.length];
       int size = arr.length-1;
       int k=1;
       duplicate[0]=arr[0];
       for(int i=0; i<arr.length-1; i++) {
           if(arr[i] != arr[i+1]) {
               duplicate[k] = arr[i+1];
               k++;
               //duplicate[size] = arr[j];
               size--;
           }

       }
//       for(int i=size; i<duplicate.length-1; i++){
//           duplicate[i] = 0;
//       }
       for(int n:duplicate){
           System.out.println(n);
       }

    }



    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);

        //System.out.println("Enter the size of Array :");
       // int n = scan.nextInt();

        int arr[] = {1,1,1,2,2,3};

//        for(int i=0; i<arr.length; i++) {
//            arr[i] = scan.nextInt();
//        }

//

        findDuplicates(arr);

    }
}

