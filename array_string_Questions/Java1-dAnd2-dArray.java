package array_string_Questions;

import java.util.Scanner;

class Demo6 {

	static int java1dAnd2dArray(int[][] arr) {

		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				if(arr[i] == arr[j]){
					sum += arr[i][j];
				}
			}
		}
		return sum;
	}

	static int brrMethod(int[] brr) {

		int max = 0;

		for(int i=0; i<brr.length-1; i++) {
			if(brr[i] > brr[i+1]) {
				max = brr[i];
			}else {
				max = brr[i+1];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
	

		int[][] arr = new int[n][n];
		int[] brr = new int[n];

		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = scan.nextInt();
			}
		}

		for(int i=0; i<brr.length; i++) {
			brr[i] = scan.nextInt();
		}

		System.out.print(java1dAnd2dArray(arr) + " ");
		System.out.println(brrMethod(brr));
	}
}