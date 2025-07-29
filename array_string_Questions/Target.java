package array_string_Questions;

import java.util.Scanner;
public class Target {
    static int[] sum(int[] arr, int target) {
        int[] result = new int[2];
        int i=0;
        int j=i+1;
        while(i<arr.length-1){
            if((arr[i] + arr[j] )==target) {
                result[0]=i;
                result[1]=j;
                break;
            }
            i++;
            j++;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {8, 7, 3, 5, 8};
        for(int n:arr){
            System.out.print(n + " ");
        }
        System.out.println("Enter your target");
        int target = sc.nextInt();
        arr= sum(arr, target);
        for(int n:arr){
            System.out.print(n + " ");
        }
    }
}
