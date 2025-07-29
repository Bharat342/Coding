package JDBC_Practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Share_Data_btwn_JavaProg_DB {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/PSA";
        String un = "root";
        String pwd = "root";

        Connection con = null;
        Statement stmt = null;
        ResultSet res = null;


        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded Successfully..");

            // "DriverManager.getConnection" is like a Road we created a road, and we are giving the name to that road as "con"
            // which is nothing but a reference of type "Connection".
            con = DriverManager.getConnection(url, un, pwd);
            System.out.println("Connection Estd..");

            // and using that road name. I mean using that "con" reference variable.
            // We create a vahicle(statement is a car and "stmt" is car name or reference to that car) to transfer our query on that road(con) which is connected to the database
            stmt = con.createStatement();
            /*
            Exp:
                Statement stmt = con.createStatement();
                --> "Statement" is class which is like a vahicle which helps to transfer data
                --> "stmt" is a car name using which we are accessing the car
                --> "con" is a like road(type Connection) where that vahicle will go and come
                --> "createStatement" is like we are creating vahicle on that road
             */

            String query = "select * from student";

            res = stmt.executeQuery(query);
            System.out.println("Query Executed..");

//            "res" always point to the first coloum which is nothing but the coloum name
//            To take the pointer the next line we use this method
//            res.next();

            // condition : if value or row present in the nextline then it will go inside
            // here se are using column_index to access the element present inside the table/result
            // also we can use column_label name also to access the element present inside the table/ result
//            while(res.next()) {
//                System.out.println(res.getInt(1) + " " + res.getString(2) + " " + res.getString(3));
//            }

            // accessing using columnLabel names.
            System.out.println();
            while(res.next()) {
                System.out.println(res.getInt("id") + " " + res.getString("name") + " " + res.getString("course"));
            }

        }catch(Exception e) {
            e.printStackTrace();
        }finally {
           try{
               res.close();
               stmt.close();
               con.close();
           }catch (Exception e) {
               e.printStackTrace();
           }
        }
    }
}
