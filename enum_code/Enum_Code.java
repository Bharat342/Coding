package enum_code;

import java.util.Scanner;

enum Result {
    passed, failed;
}

public class Enum_Code {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your percentage : ");
        float sharada = scan.nextFloat();

        if(sharada >= 30.00) {
            Result r = Result.passed;
            System.out.println(r);
        } else {
            Result r = Result.failed;
            System.out.println(r);
        }
    }
}
