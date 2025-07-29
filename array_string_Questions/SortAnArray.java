package array_string_Questions;

import java.util.Scanner;

class Demo7 {

	static void sortAnArray(int[] arr) {

		int l = 0;
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] > arr[j]) {
					l = arr[i];
					arr[i] = arr[j];
					arr[j] = l ;
				}
			}
		}
			for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the Size of an Array :");
		int n = scan.nextInt();

		int[] arr = new int[n];

		for(int i=0; i<arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		sortAnArray(arr);
	}
}