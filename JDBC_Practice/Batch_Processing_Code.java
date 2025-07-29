package JDBC_Practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class Batch_Processing_Code {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Connection con = null;
        Statement stmt = null;

        String url = "jdbc:mysql://localhost:3306/PSA";
        String un = "root";
        String pwd = "root";

        try{
            con = DriverManager.getConnection(url, un, pwd);
            stmt = con.createStatement();
            System.out.println("Enter your Query :");
//            String query = scan.nextLine();
            String query1 = "INSERT INTO `PSA`.`student` (`id`, `name`, `course`) VALUES ('10', 'a', 'nothing');";
            String query2 = "INSERT INTO `PSA`.`student` (`id`, `name`, `course`) VALUES ('11', 'b', 'nothing');";
            String query3 = "INSERT INTO `PSA`.`student` (`id`, `name`, `course`) VALUES ('12', 'c', 'nothing');";

            // adding to a batch so that we can execute the queries all together
            stmt.addBatch(query1);
            stmt.addBatch(query2);
            stmt.addBatch(query3);

            //execute the queries together as a batch
            stmt.executeBatch();
            System.out.println("Query Executed Successfully...");

        }catch(Exception e) {
            e.printStackTrace();
        }finally {
            try{
                stmt.close();
                con.close();
            }catch(Exception e) {
                e.printStackTrace();
            }
        }
    }
}
