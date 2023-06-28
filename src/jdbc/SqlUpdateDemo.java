package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class SqlUpdateDemo {
    public static void main(String[] args) {
        String url ="jdbc:mysql://localhost:3306/Java30Jan";
        String username="root";
        String password="Codekul@123";
        String sql = " update student set nm = ? where rno = ?";
        Scanner sc = new Scanner(System.in);
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url,username,password);
            System.out.println("Enter roll no");
            int rno = sc.nextInt();
            System.out.println("Enter name");
            String name = sc.next();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1,name);
            ps.setInt(2,rno);
            int i =  ps.executeUpdate();
            System.out.println(i +" record/s updated");
        }catch (ClassNotFoundException | SQLException e){
            System.out.println(e.getMessage());
        }finally {
            try {
                con.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
