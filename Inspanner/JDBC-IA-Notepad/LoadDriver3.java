// creation of a table using jdbc 

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.*;

public class LoadDriver3 {
	public static void main(String args[]) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = null;
			conn = DriverManager.getConnection("jdbc:mysql://localhost/student?" + "user=root&password=Aliya@032");

			String sql = "CREATE TABLE inspanner_students(RollNumber integer, Name varchar(255))";
			
			Statement st = conn.createStatement();
			st.executeUpdate(sql);

			conn.close(); //closing the connection
		} catch (Exception e) {
			System.out.println("Error occured: " + e);
		}

	}
}
