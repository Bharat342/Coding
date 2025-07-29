import java.util.Scanner;

public class NextLine_Code {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

//        System.out.println("number");
//        int n = scan.nextInt();


        String[] arr = new String[2];
        System.out.println("name");

//      scan.nextLine();
        for( int i=0; i<arr.length; i++) {
            arr[i] = scan.nextLine();
            //System.out.println(arr[i]);
        }

        for(String s : arr) {
            System.out.println(s);
        }
    }
}

/*
import java.util.Scanner;

public class NextLine_Code {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("number");
        int n = scan.nextInt();
        String[] arr = new String[n];

        System.out.println("name");
        for(int i=0; i<arr.length; i++) {
            arr[i] = scan.nextLine();
        }

        for(String s : arr) {
            System.out.println(s);
        }
    }
}

 */
