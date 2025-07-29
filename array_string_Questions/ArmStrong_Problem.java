package array_string_Questions;

import java.util.Scanner;

public class ArmStrong_Problem {

    boolean checkArmStrong(int n) {
        // Getting the length of the given number
        int length = getLength(n);

        //converting the number into an array of integer
        int[] arr = getArray(n, length);

        int result = findArmStrongNo(arr, length);

        if(result == n) {
            return true;
        }
        return false;
    }

    // method to get length of n
    int getLength(int n) {
        int count = 0;
        int nn = n;
        while(n != 0) {
            n = n / 10;
            count++;
        }
        return count;
    }

    // method to converting number into integer array
    int[] getArray(int n, int length) {
        int[] temp = new int[length];
        int a = 1;
        for(int i=0; i<length; i++) {
            int local = n / a;
            temp[i] = local % 10;
            a = a * 10;
        }
        return temp;
    }

    int findArmStrongNo(int[] arr, int length) {
        int result = 0;
        for(int i=0; i<arr.length; i++) {
            result += fetchMultiply(arr[i], length);
        }
        return result;
    }

    int fetchMultiply(int i, int length) {
        int result = 1;

        for(int j=0; j<length; j++) {
            result *= i;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number to Check ArmStrong Number :");
        int n = scan.nextInt();

        ArmStrong_Problem armStrongProblem = new ArmStrong_Problem();
        System.out.println(armStrongProblem.checkArmStrong(n));
    }
}
