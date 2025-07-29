package array_string_Questions;

import java.util.Scanner;

class Demo5 {

	static int largestElementInArray(int[] arr) {

		int count = 0;

		for(int i=0; i<arr.length-1; i++) {
			if(arr[i] > arr[i+1]) {
				count=arr[i];
			}else {
				count = arr[i+1];
			}
		}
		return count;
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		int[] arr = new int[n];

		for(int i=0; i<arr.length; i++) {
			arr[i] = scan.nextInt();
		}

		System.out.println(largestElementInArray(arr));
	}
}