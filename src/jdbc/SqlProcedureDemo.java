package jdbc;

import java.sql.*;
import java.util.Scanner;

public class SqlProcedureDemo {
    public static void main(String[] args) throws SQLException {
        String url ="jdbc:mysql://localhost:3306/Java30Jan";
        String username="root";
        String password="Codekul@123";
        String sql = " call sp_get_stud_name_by_rno(?,?)";
        Scanner sc = new Scanner(System.in);
        Connection con = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url,username,password);
            System.out.println("Enter roll no");
            int rno = sc.nextInt();
            CallableStatement statement = con.prepareCall(sql);
            statement.setInt(1,rno);
            statement.registerOutParameter(2,Types.VARCHAR);
            statement.execute();
            String name = statement.getString(2);
            System.out.println("Name of student with Roll No. "+ rno + " is "+name);
        }catch (ClassNotFoundException | SQLException e){
            System.out.println(e.getMessage());
        }finally {
            con.close();
        }
    }
}
