package lamda_expression_code;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter First Value :");
        int a = scan.nextInt();

        System.out.println("Enter Second Value :");
        int b = scan.nextInt();

        FirstExample firstExample = new FirstExample();
        System.out.println("Your Result is : " + firstExample.l.add(a,b));
    }
}
