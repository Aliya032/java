// insertion of values using jdbc in the earlier created table

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.*;

public class LoadDriver4 {
	public static void main(String args[]) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = null;
			conn = DriverManager.getConnection("jdbc:mysql://localhost/student?" + "user=root&password=Aliya@032");

			String sql = "INSERT INTO inspanner_students(RollNumber, Name) values(?,?);";

			PreparedStatement pst = conn.prepareStatement(sql);

			pst.setInt(1, 33);
			pst.setString(2, "Aliya");

			pst.executeUpdate();

			conn.close();

		} catch (Exception e) {
			System.out.println("Error occured: " + e);
		}
	}
}
