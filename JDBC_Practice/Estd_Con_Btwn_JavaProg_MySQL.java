package JDBC_Practice;

import java.sql.*;
import java.util.Scanner;

public class Estd_Con_Btwn_JavaProg_MySQL {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Connection con = null;

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Loaded Successfully..");
            /*
            And as we can see, the driver was successfully loaded into the RAM. Let us proceed to the next
            step-Now that the driver is successfully loaded into the Java program, the Java program and MySQL can now interact with each other.
            But to achieve this, we have to establish a connection between our java program and MySQL.
            We will call this connection ‘con’.
            Imagine this connection as a road through with information that can be sent from the java program to MySQL and vice versa.
            So how do we create this connection??
            For that, we have to make use of a method called as getConnection( ).
            getConnection( ) is a static method which is present inside DriverManager class.
            Let us see how to establish the connection using the getConnection( ).
            getConnection( ) method accepts 3 parameters as shown below-
            1. url of the database ("jdbc:mysql://localhost:3306/PSA")
                                     api  vendor   ip_addr portNo db_Name
            2. userName
            3. password
             */
            String url = "jdbc:mysql://localhost:3306/PSA";
            System.out.println("Enter UserName : ");
            String un = scan.next();
            System.out.println("Enter Password : ");
            String pwd = scan.next();

            con = DriverManager.getConnection(url, un, pwd);
            System.out.println("Vaaaaaoooo..... Nacee... Connection Establishes!");

        }catch(ClassNotFoundException e) {
            e.printStackTrace();
        }catch(Exception f) {
            System.out.println("Chhii chii chii chi...");
        }finally {
            try{
                con.close();
                System.out.println("Connection Closed.. tata.");
            }catch(Exception e) {
                e.printStackTrace();
            }
        }
    }
}
