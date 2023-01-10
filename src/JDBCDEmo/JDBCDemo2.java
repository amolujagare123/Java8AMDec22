package JDBCDEmo;

import java.sql.*;

public class JDBCDemo2 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //1 . loading a driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        //2.  creating a connection
        String username = "root";
        String password = "root";
        String connectionUrl = "jdbc:mysql://localhost:3306/8ambatch";

        Connection con  = DriverManager.getConnection(connectionUrl,username,password);
        //3. Creating statement

        Statement st = con.createStatement();

        //4. Executing query
        String sql = "select * from student where name='rutuja'";

        ResultSet rs = st.executeQuery(sql);

        while (rs.next())
        {
            System.out.print(rs.getInt("id")+"\t\t");
            System.out.print(rs.getString("name")+"\t\t");
            System.out.print(rs.getString("email")+"\t\t");
            System.out.print(rs.getInt("marks")+"\t\t");
            System.out.println(rs.getString("branch"));
        }

    }
}
