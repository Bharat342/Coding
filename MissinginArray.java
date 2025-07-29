
public class MissinginArray {

    static int missingArray(int[] arr) {
        int sum = 0;
        for(int i=0; i<arr.length; i++) {
            sum += arr[i];
        }

        int n = arr.length+1;
        int key = n*(n+1)/2;

        return key-sum;
    }
    public static void main(String[] args) {

        int[] arr = {8, 3, 4, 2, 6, 7, 1};

        System.out.println(missingArray(arr));
    }
}
