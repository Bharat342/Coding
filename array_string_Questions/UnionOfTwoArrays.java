package array_string_Questions;

import java.util.Scanner;

class Demo1 {

	static int unionOfTwoArray(int[] arr1, int[] arr2, int[] arr3) {

		int union = 0,temp = 0;

		for(int i=0; i<arr1.length; i++) {
			arr3[i] = arr1[i];
		}

		for(int j=0; j<arr2.length; j++) {
			arr3[arr1.length+j] = arr2[j];
		}
		for(int k=0; k<arr3.length; k++) {
			for(int j=0; j<arr3.length; j++) {
				if(arr3[k] < arr3[j]) {
					temp = arr3[k];
				    arr3[k] = arr3[j];
				    arr3[j] = temp;
				}
			}
		}
		for(int k=0; k<arr3.length-1; k++) {
			if(arr3[k] != arr3[k+1]){
				union++;
			}
		}
		return union+1;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Size of arr1 :");
		int m = scan.nextInt();

		System.out.println("Size of arr2 :");
		int n = scan.nextInt();

		System.out.println("Elements of arr1 :");
		int[] arr1 = new int[m];
		
		System.out.println("Elements of arr2 :");
		int[] arr2 = new int[n];

		int[] arr3 = new int[m+n];

		for(int i=0; i<arr1.length; i++) {
			arr1[i] = scan.nextInt();
		}

		for(int j=0; j<arr2.length; j++) {
			arr2[j] = scan.nextInt();
		}

		System.out.println(unionOfTwoArray(arr1,arr2,arr3));

	}
}