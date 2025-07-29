
// Hackerrank Challenge : DivisibleSumPairs

import java.util.Scanner;

class Demo4 {

    static int divisibleSumPairs(int[] arr,int k) {
        
        int count = 0;

        for(int i=0; i<arr.length-1; i++) {
            for(int j=i+1; j<arr.length; j++) {
                if((arr[i] + arr[j]) % k == 0) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("The length of the array :");
        int n = scan.nextInt();

        System.out.println("The integer divisor :");
        int k = scan.nextInt();

        int[] arr = new int[n];

        for(int i=0; i<arr.length; i++) {
            arr[i] = scan.nextInt();
        }

        System.out.println(divisibleSumPairs(arr,k));
    }
}