import java.util.Scanner;

public class MergeArray {

    static int[] mergingArray(int[] arr1, int[] arr2) {
        int[] arr3 = new int[(arr1.length+arr2.length)];
        int i=0, j=0, k=0;
        while(i < arr1.length && j < arr2.length ) {
            if(arr1[i] < arr2[j]) {
                arr3[k] = arr1[i];
                k++;
                i++;
            } else {
                arr3[k] = arr2[j];
                k++;
                j++;
            }
            while(i < arr1.length) {
                arr3[k] = arr1[i];
                k++;
                i++;
            }
            while(j < arr2.length) {
                arr3[k] = arr2[j];
                k++;
                j++;
            }
        }
        return arr3;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int k = scan.nextInt();

        int[] arr1 = new int[n];
        int[] arr2 = new int[k];

        for(int i=0; i<arr1.length; i++) {
            arr1[i] = scan.nextInt();
        }
        for(int i=0; i<arr2.length; i++) {
            arr2[i] = scan.nextInt();
        }

        int[] res = mergingArray(arr1, arr2);

        for(int i=0; i<res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }
}
