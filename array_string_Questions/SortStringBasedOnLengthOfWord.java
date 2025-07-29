package array_string_Questions;

import java.util.Scanner;

import static java.awt.Color.pink;

public class SortStringBasedOnLengthOfWord {
    public String[] sortString(String[] arr) {
        for(int i=0; i<arr.length-1; i++) {
            for(int j=i+1; j<arr.length; j++) {
                if(arr[i].length() > arr[j].length()) {
                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the size of an Arrray : ");
        int n = scan.nextInt();

        String[] arr = new String[n];

        for(int i=0; i<arr.length; i++) {
            arr[i] = scan.next();
        }

        SortStringBasedOnLengthOfWord s = new SortStringBasedOnLengthOfWord();
        arr = s.sortString(arr);

        for(String a : arr) {
            System.out.print(a + " ");
        }

    }

}
