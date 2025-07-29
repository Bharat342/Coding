package student_management_system;

import java.util.Scanner;



public class Driver {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println();
        System.out.println("Welcome to Student Management System!");
        System.out.println();

        System.out.println("enter your name : ");
        String studentName = scan.next();

        System.out.println("Enter your id : ");
        int id = scan.nextInt();

        System.out.println("Enter your course : ");
        String course = scan.next();

        Student_Management sms = new Student_Management(studentName, id, course);

        sms.dispStudentDetails();

        Library_Books_Access lba = new Library_Books_Access();
        System.out.println();
        System.out.println("Do you want visit Library press Yes/No");
        if(scan.next().equalsIgnoreCase("yes")) {
            lba.getBookDetails();
        }else {
            System.exit(0);
        }

    }
}









