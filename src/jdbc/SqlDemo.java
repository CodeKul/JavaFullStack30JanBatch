package jdbc;

import java.sql.*;

public class SqlDemo {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url ="jdbc:mysql://localhost:3306/Java30Jan";
        String username="root";
        String password="Codekul@123";
       Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con =DriverManager.getConnection(url,username,password);
        Statement st = con.createStatement();
       ResultSet resultSet =  st.executeQuery("select  * from student");
       while (resultSet.next()){
           System.out.println("---------Student---------------");
           System.out.println("Roll No "+resultSet.getInt(1));
           System.out.println("Name No "+resultSet.getString(2));
           System.out.println("Age "+resultSet.getInt(3));
       }
       con.close();
    }
}

//class Demo{
//    {
//        System.out.println("in instance block");
//    }
//    static {
//        System.out.println("in static block");
//    }
//}