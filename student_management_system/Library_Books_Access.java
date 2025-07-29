package student_management_system;

import java.util.ArrayList;
import java.util.Scanner;

public class Library_Books_Access {
    Scanner scan = new Scanner(System.in);

    String[][] arr = new String[2][2];

    void javaDetails(){
        arr[0][0] = "Java By Durga Sir!";
        arr[0][1] = "Java By Pankaj Sir!";
        System.out.println("Java Books Are : "+ arr[0][0] + " " + arr[0][1]);
    }

    void pythonDetails() {
        arr[1][0] = "python By ashish Sir!";
        arr[1][1] = "python By bharat Sir!";
        System.out.println("python Books Are : "+ arr[1][0] + " " + arr[1][1]);
    }

    void getBookDetails() {
        System.out.println("Which Book Details you want to see : ");
        System.out.println("Enter 1 for Java");
        System.out.println("Enter 2 for python");
        int input = scan.nextInt();
        if(input == 1) {
            javaDetails();
        } else if(input == 2) {
            pythonDetails();
        } else {
            System.out.println("please enter valid number 1 or 2 only!");
        }
    }

}
