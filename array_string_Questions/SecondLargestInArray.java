package array_string_Questions;

public class SecondLargestInArray {
    public int getSecondLargest(int[] arr) {
        for(int i=0; i<arr.length-1; i++) {
            for(int j=i+1; j<arr.length; j++) {
                if(arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        int i = 0;
        while(i < arr.length-1) {
            if(arr[i] != arr[i+1]) {
                return arr[i+1];
            } else {
                i++;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};
        SecondLargestInArray s = new SecondLargestInArray();

        System.out.println(s.getSecondLargest(arr));
    }
}
