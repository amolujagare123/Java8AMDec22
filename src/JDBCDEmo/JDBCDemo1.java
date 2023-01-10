package JDBCDEmo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo1 {

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
        String sql = "insert into student values(12,'rutuja','rutuja@gmail.com',90,'IT')";

        st.executeUpdate(sql);

    }
}
