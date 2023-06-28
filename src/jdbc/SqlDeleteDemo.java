package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class SqlDeleteDemo {
    public static void main(String[] args) {
        String url ="jdbc:mysql://localhost:3306/Java30Jan";
        String username="root";
        String password="Codekul@123";
        String sql = "delete from student where rno = ?";
        Scanner sc = new Scanner(System.in);
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url,username,password);
            System.out.println("Enter roll no");
            int rno = sc.nextInt();

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1,rno);
            int i =  ps.executeUpdate();
            System.out.println(i +" record/s delete");
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
