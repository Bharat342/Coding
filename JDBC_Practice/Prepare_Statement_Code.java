package JDBC_Practice;

import java.sql.*;
import java.util.Scanner;

public class Prepare_Statement_Code {

    void insertValueWithPrepareStatement(Connection con) throws Exception {

        String query = "insert into student (`id`, `name`, `course`) values (?, ?, ?)";
        PreparedStatement pstmt = con.prepareStatement(query);

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter id");
        int id = scan.nextInt();

        System.out.println("Enter your name");
        String name = scan.next();

        System.out.println("Enter your course");
        String course = scan.next();

        pstmt.setInt(1, id);
        pstmt.setString(2, name);
        pstmt.setString(3, course);

        pstmt.execute();
        System.out.println("Query Executed.");
    }

    void insertMultipleValuesWithPrepareStatement(Connection con) throws Exception {

        String query = "insert into student (id, name, course) values (?, ?, ?)";

        PreparedStatement pstmt = con.prepareStatement(query);
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of entry you want to enter :");
        int n = scan.nextInt();

        con.setAutoCommit(false);
        for(int i=1; i<=n; i++) {
            System.out.println("Enter Id : ");
            int id = scan.nextInt();

            System.out.println("Enter name :");
            String name = scan.next();

            System.out.println("Enter course :");
            String course = scan.next();

            pstmt.setInt(1, id);
            pstmt.setString(2, name);
            pstmt.setString(3, course);

            pstmt.execute();

            /*
            Since we are in a loop, the editor is waiting for the next input, and we can keep inserting the data, till the loop is terminated.
            But what if there was a problem due to which few rows were not inserted?
            This could result in an incomplete database and this could lead to a problem in the future.
            We have to follow the property in DBMS, which is known as the ACID(Atomicity, Consistency, Isolation, Durability)and every database must possess this property.
            So according to this property, we should have inserted 3 rows into our database. But due to some issue if all 3 rows could not be inserted, then None of the rows should be inserted.
            We have to follow All or None rule. I.e., either all the rows should be inserted or none of the rows should be inserted.
            So how can we achieve this?
            Even if we insert a row into the table, until and unless all rows are inserted, data should not be committed into the database. To achieve this, we can make use of a method known as "setAutoCommit()"
            This method takes a boolean value and by default it’s true. So by setting its value as false, we can make sure that the data will not be committed into the database, until we call commit() it will not be committed into the database.
             */
        }
        con.commit();
    }

    public static void main(String[] args) {

        Connection con = null;
        Statement stmt = null;
        ResultSet res = null;

        String url = "jdbc:mysql://localhost:3306/PSA";
        String un = "root";
        String pwd = "root";

        try{

           con = DriverManager.getConnection(url, un, pwd);
           stmt = con.createStatement();

           res = stmt.executeQuery("select * from student");
           res = stmt.executeQuery("select * from student");

           ResultSetMetaData metaData = res.getMetaData();

            System.out.println();
           for(int i=1; i<=metaData.getColumnCount(); i++) {
               System.out.println(metaData.getColumnName(i) + " = " + metaData.getColumnTypeName(i));
           }

            System.out.println();
           while(res.next()) {
               System.out.println(res.getInt(1)  + " " + res.getString(2) + " " + res.getString(3));
           }

           Prepare_Statement_Code prepareStatementCode = new Prepare_Statement_Code();

            System.out.println("Enter 1 for one input / Enter 2 for multiple input");
            Scanner scan = new Scanner(System.in);
            int input = scan.nextInt();
            if(1 == input) {
                prepareStatementCode.insertValueWithPrepareStatement(con);
            }else if (2 == input) {
                prepareStatementCode.insertMultipleValuesWithPrepareStatement(con);
            } else {
                System.out.println("invalid input...");
            }

        }catch(Exception e) {
            e.printStackTrace();
        }finally{
            try{
                res.close();
                stmt.close();
                con.close();
            }catch(Exception e) {
                e.printStackTrace();
            }
        }
    }
}

