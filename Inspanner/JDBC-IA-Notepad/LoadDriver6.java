//using scanner class to take input from the user for updating a row

import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.*;

public class LoadDriver6 {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter roll number to update: ");
		int roll = sc.nextInt();
		System.out.println("Enter name to update: ");
		String name = sc.next();

		String sql = "UPDATE  inspanner_students " + "SET Name = ?" + " WHERE RollNumber = ? ";

		System.out.println(roll + " " + name);
		
		System.out.println(sql);

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = null;
			conn = DriverManager.getConnection("jdbc:mysql://localhost/student?" + "user=root&password=Aliya@032");
			
			PreparedStatement pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, name);
			pstmt.setInt(2, roll);

			int rows = pstmt.executeUpdate();
			if (rows > 0 )
				System.out.println("Row successfully updated");

			conn.close();
			
		} catch (Exception e) {
			System.out.println("didn't get inserted: " + e);
		}
	}
}

