package array_string_Questions;

import java.util.Scanner;

class Demo {

	static void sortArray(int[] arr) {

		int k = 0;

		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] >= arr[j]) {
					k = arr[i];
					arr[i] = arr[j];
					arr[j] = k;
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

		System.out.println("Enter the size of Array :");
		int n = scan.nextInt();

		int[] arr = new int[n];

		for(int i=0; i<arr.length; i++) {
			arr[i] = scan.nextInt();
		}

		sortArray(arr);
	}
}




