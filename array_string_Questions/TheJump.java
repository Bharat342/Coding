package array_string_Questions;

public class TheJump {

    int minimumJump(int[] arr) {
        int i = 0;
        int count = 0;

        while(arr[i] != 0 && i <= arr.length) {
            i += arr[i];
            if(i >= arr.length) {
                return count;
            }
            count++;
        }
        return -1;
    }
}

class Driver {
    public static void main(String[] args) {
        //           0  1  2  3  4  5  6  7  8  9  10
//        int[] arr = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
        int[] arr = {2, 3, 1, 1, 4};
        TheJump jump = new TheJump();
        System.out.println(jump.minimumJump(arr));
        if(jump.minimumJump(arr) == -1) {
            System.out.println("false");
        } else {
            System.out.println("true");
        }
    }
}