
import java.util.Scanner;

class Demo8
{
	static void maxMinArray(int[] arr) 
	{
		int max,min;

		min = arr[0];
		max = arr[1];

		for(int i=2; i<arr.length; i++) 
		{
			if(arr[i] > max) 
			{
				max = arr[i];
			}else if (min > arr[i]) 
			{

				min = arr[i];
		    }
		}

		System.out.println(min + " " + max);
	}

	public static void main(String[] args) 
	{

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the size of Array :");
		int n = scan.nextInt();

		int[] arr = new int[n];

		for(int i=0; i<arr.length; i++) 
		{
			arr[i] = scan.nextInt();
		}

		maxMinArray(arr);
	}
}