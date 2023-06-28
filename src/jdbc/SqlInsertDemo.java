package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class SqlInsertDemo {
    public static void main(String[] args) throws SQLException {
        String url ="jdbc:mysql://localhost:3306/Java30Jan";
        String username="root";
        String password="Codekul@123";
        String sql = "insert into student values(?,?,?)";
        Scanner sc = new Scanner(System.in);
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url,username,password);
            System.out.println("Enter roll no");
            int rno = sc.nextInt();
            System.out.println("Enter name");
            String name = sc.next();
            System.out.println("Enter age");
            int age = sc.nextInt();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1,rno);
            ps.setString(2,name);
            ps.setInt(3,age);
            int i =  ps.executeUpdate();
            System.out.println(i +" records are inserted");
        }catch (ClassNotFoundException|SQLException e){
            System.out.println(e.getMessage());
        }finally {
            con.close();
        }
    }
}
