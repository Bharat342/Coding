
import java.util.Scanner;

class Demo9 {

	static int kthSmallestElement(int[] arr, int k) {

		int l=0;
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] > arr[j]) {
					l = arr[i];
					arr[i] = arr[j];
					arr[j] = l ;
				}
			}
		}
			return arr[k-1];
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Give size of an Array :");
		int n = scan.nextInt();

		System.out.println("enter the value of k :");
		int k = scan.nextInt();

		int[] arr = new int[n];

		for(int i=0; i<arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		System.out.println(kthSmallestElement(arr,k));
	}
}