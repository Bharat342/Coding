package array_string_Questions;

import java.util.Scanner;

public class PalindromNumber {

    boolean checkPalindrom(int n) {

        ArmStrong_Problem armStrongProblem = new ArmStrong_Problem();
        int length = armStrongProblem.getLength(n);
        /*
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
         */
        int[] arr = armStrongProblem.getArray(n, length);
        if(arr.length == 1) {
            return true;
        }

        for(int i=0; i<arr.length; i++) {
            if(arr[i] != arr[length-1] ) {
                return false;
            } else {
                int start = 0;
                int end = length-1;
                while(start < n/2) {
                    if(arr[start] == arr[end]) {
                        start++;
                        end--;
                        if(start >= end) {
                            return true;
                        }
                    }else {
                        return false;
                    }
                }
            }
        }
        return false;
    }

    boolean checkPalindromNumber(String s) {

        if(s.length() == 1 && s.charAt(0) == s.charAt(s.length()-1)) {
            return true;
        }
        int start = 0;
        int end = s.length()-1;

        while(start < s.length()/2) {
            if(s.charAt(start) == s.charAt(end)) {
                start++;
                end--;
                if(start >= end) {
                    return true;
                }
            }else{
                return false;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number to check Palindrom number or not : ");
        PalindromNumber palindromNumber = new PalindromNumber();

//        System.out.println(palindromNumber.checkPalindrom(scan.nextInt()));;

        System.out.println(palindromNumber.checkPalindromNumber(scan.next()));
    }
}
