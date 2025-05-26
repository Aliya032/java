//using scanner class to take input from the user and insert into that table

import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.*;

public class LoadDriver5 {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter roll number and name: ");
		int roll = sc.nextInt();
		String name = sc.next();

		String sql = "INSERT INTO inspanner_students values ("  +roll + ", ' "  + name + " ')";

		System.out.println(sql);

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = null;
			conn = DriverManager.getConnection("jdbc:mysql://localhost/student?" + "user=root&password=Aliya@032");

			Statement st = conn.createStatement();

			int rows = st.executeUpdate(sql);

			if (rows > 0) 
				System.out.println("Row successfully inserted");

			conn.close();
		} catch (Exception e) {
			System.out.println("Unsuccessful insertion - " + e);
		}
	}
}

