package jdbc;

import java.sql.*;
import java.util.Scanner;

public class BatchProcessingDemo {
    public static void main(String[] args) {
        String url ="jdbc:mysql://localhost:3306/Java30Jan";
        String username="root";
        String password="Codekul@123";
        String sql1 = "insert into student values(8,'Punam',19)";
        String sql2 = "insert into student values(9,'Shreya',20)";
        String sql3 = "insert into student values(10,'Ruchi',22)";
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url,username,password);
            Statement st = con.createStatement();
            st.addBatch(sql1);
            st.addBatch(sql2);
            st.addBatch(sql3);
            st.executeBatch();
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
