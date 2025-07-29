package JDBC_Practice;

public class LoadingDriver {
    public static void main(String[] args) {
        try {
            // Loading Driver into the RAM so that our java program can communicate with MySQL
            // Driver is work like a mediator between java program and mysql(RDBMS)
            // There is static method called "forName()" present indside a class whose name is "Class"
            // using which we can load the Driver into the RAM.
            // EXP : Class.forName("Path of the Driver")

            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded Successfully.");

            // if the driver loaded into the RAM Successfully then we are printing the message
            // Driver loaded Successfully.
            // Else is will Generate an Exception.
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}

