
import java.util.Scanner;

class Demo3 {

	static int countOfSmallerElements(int[] arr, int x) {

		int count = 0;

		for(int i=0; i<arr.length; i++) {
			if(arr[i]<=x) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int x = scan.nextInt();

		int[] arr = new int[n];

		for(int i=0; i<arr.length; i++) {
			arr[i] = scan.nextInt();
		}

		System.out.println(countOfSmallerElements(arr,x));
	}
}