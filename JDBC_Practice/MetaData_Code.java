package JDBC_Practice;

import java.sql.*;

public class MetaData_Code {
    public static void main(String[] args) {

        Connection con = null;
        Statement stmt = null;
        ResultSet res = null;

        String url = "jdbc:mysql://localhost:3306/PSA";
        String un = "root";
        String pwd = "root";

        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
            // After JDBC version 4.0 we can skip this part(Loading the Driver Class) because internally this thing happening automatically.

            con = DriverManager.getConnection(url, un, pwd);
            stmt = con.createStatement();
            String query = "select * from student";
            res = stmt.executeQuery(query);
            ResultSetMetaData metaData = res.getMetaData();



          System.out.println("Number of Column : " + metaData.getColumnCount());
          System.out.println("Column Names : " + metaData.getColumnLabel(1)  + " " +
            metaData.getColumnLabel(2) + " " + metaData.getColumnName(3));

            for(int i=1; i<=metaData.getColumnCount(); i++) {
                System.out.println(metaData.getColumnTypeName(i) + " : " + metaData.getColumnLabel(i));
            }

            System.out.println();
            System.out.println("<-- Student Data -->");
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
            }catch(Exception e1) {
                e1.printStackTrace();
            }
        }
    }
}
