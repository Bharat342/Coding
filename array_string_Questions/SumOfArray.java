package array_string_Questions;
// GeeksforGeeks Chalenges : Sum of Array

import java.util.Scanner;

class Demo2 {

	static int sumOfArray(int[] arr,int n) {

		int sum = 0;

		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the Size of an Array :");
		int n = scan.nextInt();

		int[] arr = new int[n];

		for(int i=0; i<arr.length; i++) {
			arr[i] = scan.nextInt();
		}

		System.out.println(sumOfArray(arr,n));
	}
}