import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class LoadDriver {
	public static void main(String args[]) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("My SQL server connected successfully");
		} catch (Exception e) {
			System.out.println("Error loading driver: " + e);
		}
	}
}